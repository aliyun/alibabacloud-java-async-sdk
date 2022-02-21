// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddApDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddApDeviceRequest</p>
 */
public class AddApDeviceRequest extends Request {
    @Body
    @NameInMap("ApMac")
    @Validation(required = true)
    private String apMac;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("SerialNumber")
    private String serialNumber;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private AddApDeviceRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.clientToken = builder.clientToken;
        this.extraParams = builder.extraParams;
        this.remark = builder.remark;
        this.serialNumber = builder.serialNumber;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<AddApDeviceRequest, Builder> {
        private String apMac; 
        private String clientToken; 
        private String extraParams; 
        private String remark; 
        private String serialNumber; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(AddApDeviceRequest response) {
            super(response);
            this.apMac = response.apMac;
            this.clientToken = response.clientToken;
            this.extraParams = response.extraParams;
            this.remark = response.remark;
            this.serialNumber = response.serialNumber;
            this.storeId = response.storeId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putBodyParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
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
