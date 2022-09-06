// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReBindLicenseDeviceRequest} extends {@link RequestModel}
 *
 * <p>ReBindLicenseDeviceRequest</p>
 */
public class ReBindLicenseDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceNameList")
    @Validation(required = true)
    private java.util.List < String > deviceNameList;

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

    private ReBindLicenseDeviceRequest(Builder builder) {
        super(builder);
        this.deviceNameList = builder.deviceNameList;
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseCode = builder.licenseCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReBindLicenseDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<ReBindLicenseDeviceRequest, Builder> {
        private java.util.List < String > deviceNameList; 
        private String iotInstanceId; 
        private String licenseCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ReBindLicenseDeviceRequest request) {
            super(request);
            this.deviceNameList = request.deviceNameList;
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
        public ReBindLicenseDeviceRequest build() {
            return new ReBindLicenseDeviceRequest(this);
        } 

    } 

}
