// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindLicenseProductRequest} extends {@link RequestModel}
 *
 * <p>UnbindLicenseProductRequest</p>
 */
public class UnbindLicenseProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String licenseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private UnbindLicenseProductRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseCode = builder.licenseCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindLicenseProductRequest create() {
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

    public static final class Builder extends Request.Builder<UnbindLicenseProductRequest, Builder> {
        private String iotInstanceId; 
        private String licenseCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(UnbindLicenseProductRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.licenseCode = request.licenseCode;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The ID of the Enterprise Edition instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-s3***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The license type that specifies the audio and video specifications. Valid values: <strong>480P</strong> and <strong>720P</strong>.</p>
         * <p>To view the license type of a product, choose <strong>License Management &gt; Product Authorization</strong> in the <strong>Real-time Communication Service</strong> console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>480P</p>
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * <p>The ProductKey of the product from which you want to unbind the license.</p>
         * <p>You can choose <strong>License Management &gt; Product Authorization</strong> in the <strong>Real-Time Communication Service</strong> console to view the <strong>ProductKey</strong> of the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gq62z***</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public UnbindLicenseProductRequest build() {
            return new UnbindLicenseProductRequest(this);
        } 

    } 

}
