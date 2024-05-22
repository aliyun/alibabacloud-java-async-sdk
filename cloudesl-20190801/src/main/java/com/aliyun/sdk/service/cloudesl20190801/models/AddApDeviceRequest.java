// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddApDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddApDeviceRequest</p>
 */
public class AddApDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApMac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apMac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private AddApDeviceRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddApDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apMac
     */
    public String getApMac() {
        return this.apMac;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<AddApDeviceRequest, Builder> {
        private String apMac; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(AddApDeviceRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.storeId = request.storeId;
        } 

        /**
         * ApMac.
         */
        public Builder apMac(String apMac) {
            this.putBodyParameter("ApMac", apMac);
            this.apMac = apMac;
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
        public AddApDeviceRequest build() {
            return new AddApDeviceRequest(this);
        } 

    } 

}
