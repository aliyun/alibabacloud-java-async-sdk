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
 * {@link ImportDeviceRequest} extends {@link RequestModel}
 *
 * <p>ImportDeviceRequest</p>
 */
public class ImportDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceSecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nickname")
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    private ImportDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.deviceSecret = builder.deviceSecret;
        this.iotInstanceId = builder.iotInstanceId;
        this.nickname = builder.nickname;
        this.productKey = builder.productKey;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceSecret
     */
    public String getDeviceSecret() {
        return this.deviceSecret;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<ImportDeviceRequest, Builder> {
        private String deviceName; 
        private String deviceSecret; 
        private String iotInstanceId; 
        private String nickname; 
        private String productKey; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(ImportDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.deviceSecret = request.deviceSecret;
            this.iotInstanceId = request.iotInstanceId;
            this.nickname = request.nickname;
            this.productKey = request.productKey;
            this.sn = request.sn;
        } 

        /**
         * <p>The DeviceName of the device.</p>
         * <p>The DeviceName must be 4 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * <p>The DeviceName must be unique in the product.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The DeviceSecret of the device.</p>
         * <p>The DeviceSecret must be 1 to 32 characters in length, and can contain letters, digits, hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b4d43f7******10ba5e5</p>
         */
        public Builder deviceSecret(String deviceSecret) {
            this.putQueryParameter("DeviceSecret", deviceSecret);
            this.deviceSecret = deviceSecret;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The alias of the device.</p>
         * <p>The alias must be 1 to 64 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <blockquote>
         * <p>If you do not specify this parameter, IoT Platform does not generate an alias for the device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Campus light</p>
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the gateway product to which the device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The serial number (SN) of the device.</p>
         * <p>The SN must be 1 to 64 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <blockquote>
         * <p>If you do not specify this parameter, IoT Platform does not generate an SN for the device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>QC4******001</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public ImportDeviceRequest build() {
            return new ImportDeviceRequest(this);
        } 

    } 

}
