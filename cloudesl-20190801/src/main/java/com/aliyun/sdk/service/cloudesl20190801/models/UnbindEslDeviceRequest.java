// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEslDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindEslDeviceRequest</p>
 */
public class UnbindEslDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslBarCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eslBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemBarCode")
    private String itemBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private UnbindEslDeviceRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.itemBarCode = builder.itemBarCode;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindEslDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
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

    public static final class Builder extends Request.Builder<UnbindEslDeviceRequest, Builder> {
        private String eslBarCode; 
        private String itemBarCode; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindEslDeviceRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
            this.itemBarCode = request.itemBarCode;
            this.storeId = request.storeId;
        } 

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
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
        public UnbindEslDeviceRequest build() {
            return new UnbindEslDeviceRequest(this);
        } 

    } 

}
