// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateDeviceNicknameRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateDeviceNicknameRequest</p>
 */
public class BatchUpdateDeviceNicknameRequest extends Request {
    @Query
    @NameInMap("DeviceNicknameInfo")
    @Validation(required = true)
    private java.util.List < DeviceNicknameInfo> deviceNicknameInfo;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchUpdateDeviceNicknameRequest(Builder builder) {
        super(builder);
        this.deviceNicknameInfo = builder.deviceNicknameInfo;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateDeviceNicknameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNicknameInfo
     */
    public java.util.List < DeviceNicknameInfo> getDeviceNicknameInfo() {
        return this.deviceNicknameInfo;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchUpdateDeviceNicknameRequest, Builder> {
        private java.util.List < DeviceNicknameInfo> deviceNicknameInfo; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateDeviceNicknameRequest response) {
            super(response);
            this.deviceNicknameInfo = response.deviceNicknameInfo;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * DeviceNicknameInfo.
         */
        public Builder deviceNicknameInfo(java.util.List < DeviceNicknameInfo> deviceNicknameInfo) {
            this.putQueryParameter("DeviceNicknameInfo", deviceNicknameInfo);
            this.deviceNicknameInfo = deviceNicknameInfo;
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

        @Override
        public BatchUpdateDeviceNicknameRequest build() {
            return new BatchUpdateDeviceNicknameRequest(this);
        } 

    } 

    public static class DeviceNicknameInfo extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("Nickname")
        private String nickname;

        @NameInMap("ProductKey")
        private String productKey;

        private DeviceNicknameInfo(Builder builder) {
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.nickname = builder.nickname;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceNicknameInfo create() {
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

        public static final class Builder {
            private String deviceName; 
            private String iotId; 
            private String nickname; 
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
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public DeviceNicknameInfo build() {
                return new DeviceNicknameInfo(this);
            } 

        } 

    }
}
