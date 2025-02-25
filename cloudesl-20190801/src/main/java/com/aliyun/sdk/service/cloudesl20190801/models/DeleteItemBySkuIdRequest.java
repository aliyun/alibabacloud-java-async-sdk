// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteItemBySkuIdRequest} extends {@link RequestModel}
 *
 * <p>DeleteItemBySkuIdRequest</p>
 */
public class DeleteItemBySkuIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkuId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skuId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private DeleteItemBySkuIdRequest(Builder builder) {
        super(builder);
        this.skuId = builder.skuId;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteItemBySkuIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DeleteItemBySkuIdRequest, Builder> {
        private String skuId; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteItemBySkuIdRequest request) {
            super(request);
            this.skuId = request.skuId;
            this.storeId = request.storeId;
        } 

        /**
         * SkuId.
         */
        public Builder skuId(String skuId) {
            this.putBodyParameter("SkuId", skuId);
            this.skuId = skuId;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public DeleteItemBySkuIdRequest build() {
            return new DeleteItemBySkuIdRequest(this);
        } 

    } 

}
