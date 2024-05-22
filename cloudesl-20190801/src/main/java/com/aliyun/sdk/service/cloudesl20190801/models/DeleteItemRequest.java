// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteItemRequest</p>
 */
public class DeleteItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemBarCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private DeleteItemRequest(Builder builder) {
        super(builder);
        this.itemBarCode = builder.itemBarCode;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DeleteItemRequest, Builder> {
        private String itemBarCode; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteItemRequest request) {
            super(request);
            this.itemBarCode = request.itemBarCode;
            this.storeId = request.storeId;
        } 

        /**
         * ItemBarCode.
         */
        public Builder itemBarCode(String itemBarCode) {
            this.putBodyParameter("ItemBarCode", itemBarCode);
            this.itemBarCode = itemBarCode;
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
        public DeleteItemRequest build() {
            return new DeleteItemRequest(this);
        } 

    } 

}
