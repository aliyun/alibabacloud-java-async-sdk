// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteItemRequest</p>
 */
public class DeleteItemRequest extends Request {
    @Body
    @NameInMap("ItemBarCode")
    @Validation(required = true)
    private String itemBarCode;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    @Body
    @NameInMap("UnbindEslDevice")
    private Boolean unbindEslDevice;

    private DeleteItemRequest(Builder builder) {
        super(builder);
        this.itemBarCode = builder.itemBarCode;
        this.storeId = builder.storeId;
        this.unbindEslDevice = builder.unbindEslDevice;
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

    /**
     * @return unbindEslDevice
     */
    public Boolean getUnbindEslDevice() {
        return this.unbindEslDevice;
    }

    public static final class Builder extends Request.Builder<DeleteItemRequest, Builder> {
        private String itemBarCode; 
        private String storeId; 
        private Boolean unbindEslDevice; 

        private Builder() {
            super();
        } 

        private Builder(DeleteItemRequest response) {
            super(response);
            this.itemBarCode = response.itemBarCode;
            this.storeId = response.storeId;
            this.unbindEslDevice = response.unbindEslDevice;
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

        /**
         * UnbindEslDevice.
         */
        public Builder unbindEslDevice(Boolean unbindEslDevice) {
            this.putBodyParameter("UnbindEslDevice", unbindEslDevice);
            this.unbindEslDevice = unbindEslDevice;
            return this;
        }

        @Override
        public DeleteItemRequest build() {
            return new DeleteItemRequest(this);
        } 

    } 

}
