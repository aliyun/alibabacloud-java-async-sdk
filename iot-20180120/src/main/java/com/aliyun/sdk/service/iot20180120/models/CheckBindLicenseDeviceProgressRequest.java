// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBindLicenseDeviceProgressRequest} extends {@link RequestModel}
 *
 * <p>CheckBindLicenseDeviceProgressRequest</p>
 */
public class CheckBindLicenseDeviceProgressRequest extends Request {
    @Query
    @NameInMap("CheckProgressId")
    @Validation(required = true)
    private String checkProgressId;

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

    private CheckBindLicenseDeviceProgressRequest(Builder builder) {
        super(builder);
        this.checkProgressId = builder.checkProgressId;
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseCode = builder.licenseCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBindLicenseDeviceProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkProgressId
     */
    public String getCheckProgressId() {
        return this.checkProgressId;
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

    public static final class Builder extends Request.Builder<CheckBindLicenseDeviceProgressRequest, Builder> {
        private String checkProgressId; 
        private String iotInstanceId; 
        private String licenseCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(CheckBindLicenseDeviceProgressRequest request) {
            super(request);
            this.checkProgressId = request.checkProgressId;
            this.iotInstanceId = request.iotInstanceId;
            this.licenseCode = request.licenseCode;
            this.productKey = request.productKey;
        } 

        /**
         * CheckProgressId.
         */
        public Builder checkProgressId(String checkProgressId) {
            this.putQueryParameter("CheckProgressId", checkProgressId);
            this.checkProgressId = checkProgressId;
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
        public CheckBindLicenseDeviceProgressRequest build() {
            return new CheckBindLicenseDeviceProgressRequest(this);
        } 

    } 

}
