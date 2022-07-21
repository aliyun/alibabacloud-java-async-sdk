// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindLicenseProductRequest} extends {@link RequestModel}
 *
 * <p>BindLicenseProductRequest</p>
 */
public class BindLicenseProductRequest extends Request {
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

    private BindLicenseProductRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseCode = builder.licenseCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindLicenseProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<BindLicenseProductRequest, Builder> {
        private String iotInstanceId; 
        private String licenseCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BindLicenseProductRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.licenseCode = request.licenseCode;
            this.productKey = request.productKey;
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
        public BindLicenseProductRequest build() {
            return new BindLicenseProductRequest(this);
        } 

    } 

}
