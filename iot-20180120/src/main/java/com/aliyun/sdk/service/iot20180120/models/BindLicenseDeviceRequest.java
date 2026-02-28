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
 * {@link BindLicenseDeviceRequest} extends {@link RequestModel}
 *
 * <p>BindLicenseDeviceRequest</p>
 */
public class BindLicenseDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceNameList")
    private java.util.List<String> deviceNameList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotIdList")
    private java.util.List<String> iotIdList;

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
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    /**
     * @return iotIdList
     */
    public java.util.List<String> getIotIdList() {
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
        private java.util.List<String> deviceNameList; 
        private java.util.List<String> iotIdList; 
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
        public Builder deviceNameList(java.util.List<String> deviceNameList) {
            this.putBodyParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
            return this;
        }

        /**
         * IotIdList.
         */
        public Builder iotIdList(java.util.List<String> iotIdList) {
            this.putBodyParameter("IotIdList", iotIdList);
            this.iotIdList = iotIdList;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Edition instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
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
         * <p>The license type that specifies the audio and video specifications. Valid values: <strong>480P</strong> and <strong>720P</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>720P</p>
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
        public BindLicenseDeviceRequest build() {
            return new BindLicenseDeviceRequest(this);
        } 

    } 

}
