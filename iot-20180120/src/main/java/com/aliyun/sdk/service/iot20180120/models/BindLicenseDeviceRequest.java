// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindLicenseDeviceRequest} extends {@link RequestModel}
 *
 * <p>BindLicenseDeviceRequest</p>
 */
public class BindLicenseDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceNameList")
    private java.util.List < String > deviceNameList;

    @Body
    @NameInMap("IotIdList")
    private java.util.List < String > iotIdList;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("LicenseCode")
    @Validation(required = true)
    private String licenseCode;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private BindLicenseDeviceRequest(Builder builder) {
        super(builder);
        this.deviceNameList = builder.deviceNameList;
        this.iotIdList = builder.iotIdList;
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseCode = builder.licenseCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindLicenseDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNameList
     */
    public java.util.List < String > getDeviceNameList() {
        return this.deviceNameList;
    }

    /**
     * @return iotIdList
     */
    public java.util.List < String > getIotIdList() {
        return this.iotIdList;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<BindLicenseDeviceRequest, Builder> {
        private java.util.List < String > deviceNameList; 
        private java.util.List < String > iotIdList; 
        private String iotInstanceId; 
        private String licenseCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BindLicenseDeviceRequest request) {
            super(request);
            this.deviceNameList = request.deviceNameList;
            this.iotIdList = request.iotIdList;
            this.iotInstanceId = request.iotInstanceId;
            this.licenseCode = request.licenseCode;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceNameList.
         */
        public Builder deviceNameList(java.util.List < String > deviceNameList) {
            this.putBodyParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
            return this;
        }

        /**
         * IotIdList.
         */
        public Builder iotIdList(java.util.List < String > iotIdList) {
            this.putBodyParameter("IotIdList", iotIdList);
            this.iotIdList = iotIdList;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * LicenseCode.
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public BindLicenseDeviceRequest build() {
            return new BindLicenseDeviceRequest(this);
        } 

    } 

}
