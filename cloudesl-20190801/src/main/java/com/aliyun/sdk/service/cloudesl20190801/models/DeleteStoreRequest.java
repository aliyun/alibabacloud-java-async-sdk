// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStoreRequest} extends {@link RequestModel}
 *
 * <p>DeleteStoreRequest</p>
 */
public class DeleteStoreRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private DeleteStoreRequest(Builder builder) {
        super(builder);
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DeleteStoreRequest, Builder> {
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStoreRequest request) {
            super(request);
            this.storeId = request.storeId;
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
        public DeleteStoreRequest build() {
            return new DeleteStoreRequest(this);
        } 

    } 

}
