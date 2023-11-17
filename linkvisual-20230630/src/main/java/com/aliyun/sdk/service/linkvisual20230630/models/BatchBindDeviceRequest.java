// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDeviceRequest} extends {@link RequestModel}
 *
 * <p>BatchBindDeviceRequest</p>
 */
public class BatchBindDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceList")
    @Validation(required = true)
    private java.util.List < DeviceList> deviceList;

    @Query
    @NameInMap("IdentityId")
    private String identityId;

    @Query
    @NameInMap("OpenId")
    private String openId;

    @Query
    @NameInMap("OpenIdAppKey")
    private String openIdAppKey;

    private BatchBindDeviceRequest(Builder builder) {
        super(builder);
        this.deviceList = builder.deviceList;
        this.identityId = builder.identityId;
        this.openId = builder.openId;
        this.openIdAppKey = builder.openIdAppKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List < DeviceList> getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
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

    public static final class Builder extends Request.Builder<BatchBindDeviceRequest, Builder> {
        private java.util.List < DeviceList> deviceList; 
        private String identityId; 
        private String openId; 
        private String openIdAppKey; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindDeviceRequest request) {
            super(request);
            this.deviceList = request.deviceList;
            this.identityId = request.identityId;
            this.openId = request.openId;
            this.openIdAppKey = request.openIdAppKey;
        } 

        /**
         * DeviceList.
         */
        public Builder deviceList(java.util.List < DeviceList> deviceList) {
            this.putQueryParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
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

        @Override
        public BatchBindDeviceRequest build() {
            return new BatchBindDeviceRequest(this);
        } 

    } 

    public static class DeviceList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        private DeviceList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String iotId; 
            private String productKey; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
