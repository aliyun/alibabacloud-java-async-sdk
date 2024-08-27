// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceCredentialResponseBody</p>
 */
public class GetDeviceCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceCredential")
    private DeviceCredential deviceCredential;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceCredentialResponseBody(Builder builder) {
        this.deviceCredential = builder.deviceCredential;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceCredentialResponseBody create() {
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
         * The information about the access credential of the device.
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

        public GetDeviceCredentialResponseBody build() {
            return new GetDeviceCredentialResponseBody(this);
        } 

    } 

    public static class DeviceCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceAccessKeyId")
        private String deviceAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("DeviceAccessKeySecret")
        private String deviceAccessKeySecret;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * The timestamp that indicates when the access credential of the device was last updated. The value of this parameter is a UNIX timestamp in milliseconds.
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
