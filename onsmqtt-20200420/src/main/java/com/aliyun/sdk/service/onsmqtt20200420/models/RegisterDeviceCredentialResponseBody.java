// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterDeviceCredentialResponseBody</p>
 */
public class RegisterDeviceCredentialResponseBody extends TeaModel {
    @NameInMap("DeviceCredential")
    private DeviceCredential deviceCredential;

    @NameInMap("RequestId")
    private String requestId;

    private RegisterDeviceCredentialResponseBody(Builder builder) {
        this.deviceCredential = builder.deviceCredential;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceCredentialResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceCredential
     */
    public DeviceCredential getDeviceCredential() {
        return this.deviceCredential;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceCredential deviceCredential; 
        private String requestId; 

        /**
         * The access credential of the device.
         */
        public Builder deviceCredential(DeviceCredential deviceCredential) {
            this.deviceCredential = deviceCredential;
            return this;
        }

        /**
         * The request ID. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterDeviceCredentialResponseBody build() {
            return new RegisterDeviceCredentialResponseBody(this);
        } 

    } 

    public static class DeviceCredential extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeviceAccessKeyId")
        private String deviceAccessKeyId;

        @NameInMap("DeviceAccessKeySecret")
        private String deviceAccessKeySecret;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private DeviceCredential(Builder builder) {
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
            this.deviceAccessKeyId = builder.deviceAccessKeyId;
            this.deviceAccessKeySecret = builder.deviceAccessKeySecret;
            this.instanceId = builder.instanceId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceCredential create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceAccessKeyId
         */
        public String getDeviceAccessKeyId() {
            return this.deviceAccessKeyId;
        }

        /**
         * @return deviceAccessKeySecret
         */
        public String getDeviceAccessKeySecret() {
            return this.deviceAccessKeySecret;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String clientId; 
            private Long createTime; 
            private String deviceAccessKeyId; 
            private String deviceAccessKeySecret; 
            private String instanceId; 
            private Long updateTime; 

            /**
             * The client ID of the device.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The timestamp that indicates when the access credential of the device was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The AccessKey ID of the device.
             */
            public Builder deviceAccessKeyId(String deviceAccessKeyId) {
                this.deviceAccessKeyId = deviceAccessKeyId;
                return this;
            }

            /**
             * The AccessKey secret of the device.
             */
            public Builder deviceAccessKeySecret(String deviceAccessKeySecret) {
                this.deviceAccessKeySecret = deviceAccessKeySecret;
                return this;
            }

            /**
             * The ID of the ApsaraMQ for MQTT instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The timestamp that indicates when the access credential of the device was last updated. Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DeviceCredential build() {
                return new DeviceCredential(this);
            } 

        } 

    }
}
