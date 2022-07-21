// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDeviceRequest} extends {@link RequestModel}
 *
 * <p>ImportDeviceRequest</p>
 */
public class ImportDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Query
    @NameInMap("DeviceSecret")
    @Validation(required = true)
    private String deviceSecret;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Nickname")
    private String nickname;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Sn")
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
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceSecret.
         */
        public Builder deviceSecret(String deviceSecret) {
            this.putQueryParameter("DeviceSecret", deviceSecret);
            this.deviceSecret = deviceSecret;
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
         * Nickname.
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
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

        /**
         * Sn.
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
