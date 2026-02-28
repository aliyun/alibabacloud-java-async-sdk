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
 * {@link BatchUpdateDeviceNicknameRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateDeviceNicknameRequest</p>
 */
public class BatchUpdateDeviceNicknameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceNicknameInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeviceNicknameInfo> deviceNicknameInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
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
    public java.util.List<DeviceNicknameInfo> getDeviceNicknameInfo() {
        return this.deviceNicknameInfo;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchUpdateDeviceNicknameRequest, Builder> {
        private java.util.List<DeviceNicknameInfo> deviceNicknameInfo; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateDeviceNicknameRequest request) {
            super(request);
            this.deviceNicknameInfo = request.deviceNicknameInfo;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceNicknameInfo(java.util.List<DeviceNicknameInfo> deviceNicknameInfo) {
            this.putQueryParameter("DeviceNicknameInfo", deviceNicknameInfo);
            this.deviceNicknameInfo = deviceNicknameInfo;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
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

    /**
     * 
     * {@link BatchUpdateDeviceNicknameRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateDeviceNicknameRequest</p>
     */
    public static class DeviceNicknameInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
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

            private Builder() {
            } 

            private Builder(DeviceNicknameInfo model) {
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.nickname = model.nickname;
                this.productKey = model.productKey;
            } 

            /**
             * <p>The DeviceName of the device.</p>
             * <blockquote>
             * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The ID of the device.</p>
             * <blockquote>
             * <p> If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Q7uOhVRdZRRlDnTLv****00100</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The new alias of the device. The alias must be 4 to 32 characters in length, and can contain letters, digits, and underscores (_). Each Chinese character is counted as two characters.</p>
             * <blockquote>
             * <p> If you do not specify this parameter, the original alias of the device will be deleted.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AliyunDataCenter</p>
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the device belongs.</p>
             * <blockquote>
             * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
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
