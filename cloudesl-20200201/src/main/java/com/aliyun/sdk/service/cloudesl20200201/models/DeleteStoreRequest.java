// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStoreRequest} extends {@link RequestModel}
 *
 * <p>DeleteStoreRequest</p>
 */
public class DeleteStoreRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private DeleteStoreRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
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
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<DeleteStoreRequest, Builder> {
        private String extraParams; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStoreRequest response) {
            super(response);
            this.extraParams = response.extraParams;
            this.storeId = response.storeId;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
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
        public DeleteStoreRequest build() {
            return new DeleteStoreRequest(this);
        } 

    } 

}
