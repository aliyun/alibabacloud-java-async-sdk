// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteApDeviceRequest</p>
 */
public class DeleteApDeviceRequest extends Request {
    @Body
    @NameInMap("ApMac")
    @Validation(required = true)
    private String apMac;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private DeleteApDeviceRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.extraParams = builder.extraParams;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteApDeviceRequest, Builder> {
        private String apMac; 
        private String extraParams; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApDeviceRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.extraParams = request.extraParams;
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
        public DeleteApDeviceRequest build() {
            return new DeleteApDeviceRequest(this);
        } 

    } 

}
