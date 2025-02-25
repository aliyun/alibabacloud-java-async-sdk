// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateApDeviceRequest} extends {@link RequestModel}
 *
 * <p>ActivateApDeviceRequest</p>
 */
public class ActivateApDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApMac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apMac;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private ActivateApDeviceRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateApDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<ActivateApDeviceRequest, Builder> {
        private String apMac; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(ActivateApDeviceRequest request) {
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
        public ActivateApDeviceRequest build() {
            return new ActivateApDeviceRequest(this);
        } 

    } 

}
