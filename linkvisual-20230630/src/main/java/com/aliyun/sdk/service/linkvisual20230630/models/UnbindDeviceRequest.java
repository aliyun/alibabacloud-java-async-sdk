// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDeviceRequest} extends {@link RequestModel}
 *
 * <p>UnbindDeviceRequest</p>
 */
public class UnbindDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IdentityId")
    private String identityId;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("OpenId")
    private String openId;

    @Query
    @NameInMap("OpenIdAppKey")
    private String openIdAppKey;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("UnbindSubDevice")
    private Boolean unbindSubDevice;

    private UnbindDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.identityId = builder.identityId;
        this.iotId = builder.iotId;
        this.openId = builder.openId;
        this.openIdAppKey = builder.openIdAppKey;
        this.productKey = builder.productKey;
        this.unbindSubDevice = builder.unbindSubDevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDeviceRequest create() {
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
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return openId
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * @return openIdAppKey
     */
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return unbindSubDevice
     */
    public Boolean getUnbindSubDevice() {
        return this.unbindSubDevice;
    }

    public static final class Builder extends Request.Builder<UnbindDeviceRequest, Builder> {
        private String deviceName; 
        private String identityId; 
        private String iotId; 
        private String openId; 
        private String openIdAppKey; 
        private String productKey; 
        private Boolean unbindSubDevice; 

        private Builder() {
            super();
        } 

        private Builder(UnbindDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.identityId = request.identityId;
            this.iotId = request.iotId;
            this.openId = request.openId;
            this.openIdAppKey = request.openIdAppKey;
            this.productKey = request.productKey;
            this.unbindSubDevice = request.unbindSubDevice;
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
         * IdentityId.
         */
        public Builder identityId(String identityId) {
            this.putQueryParameter("IdentityId", identityId);
            this.identityId = identityId;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * OpenId.
         */
        public Builder openId(String openId) {
            this.putQueryParameter("OpenId", openId);
            this.openId = openId;
            return this;
        }

        /**
         * OpenIdAppKey.
         */
        public Builder openIdAppKey(String openIdAppKey) {
            this.putQueryParameter("OpenIdAppKey", openIdAppKey);
            this.openIdAppKey = openIdAppKey;
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
         * UnbindSubDevice.
         */
        public Builder unbindSubDevice(Boolean unbindSubDevice) {
            this.putQueryParameter("UnbindSubDevice", unbindSubDevice);
            this.unbindSubDevice = unbindSubDevice;
            return this;
        }

        @Override
        public UnbindDeviceRequest build() {
            return new UnbindDeviceRequest(this);
        } 

    } 

}
