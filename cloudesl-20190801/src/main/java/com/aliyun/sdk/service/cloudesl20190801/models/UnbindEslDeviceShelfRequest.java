// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEslDeviceShelfRequest} extends {@link RequestModel}
 *
 * <p>UnbindEslDeviceShelfRequest</p>
 */
public class UnbindEslDeviceShelfRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslBarCode")
    private String eslBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private UnbindEslDeviceShelfRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindEslDeviceShelfRequest create() {
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
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<UnbindEslDeviceShelfRequest, Builder> {
        private String eslBarCode; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindEslDeviceShelfRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
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
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public UnbindEslDeviceShelfRequest build() {
            return new UnbindEslDeviceShelfRequest(this);
        } 

    } 

}
