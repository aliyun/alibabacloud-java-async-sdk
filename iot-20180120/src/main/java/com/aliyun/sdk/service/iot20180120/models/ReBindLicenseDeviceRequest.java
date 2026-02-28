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
 * {@link ReBindLicenseDeviceRequest} extends {@link RequestModel}
 *
 * <p>ReBindLicenseDeviceRequest</p>
 */
public class ReBindLicenseDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceNameList;

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
    public java.util.List<String> getDeviceNameList() {
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
        private java.util.List<String> deviceNameList; 
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
         * <p>The <strong>DeviceNames</strong> of all devices to which you want to rebind a license.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation to query the <strong>DeviceNames</strong> of all devices that belong to a specific product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder deviceNameList(java.util.List<String> deviceNameList) {
            this.putBodyParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> You must specify the ID of a public instance of the new version or an Enterprise Edition instance. Otherwise, the request fails. You do not need to specify the ID of a public instance of the previous version.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-e3***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The license type. Set the value to <strong>LINK_SPEECH_COMMON_LICENSE</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LINK_SPEECH_COMMON_LICENSE</p>
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
         * <p>You can go to the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2YwD23***</p>
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
