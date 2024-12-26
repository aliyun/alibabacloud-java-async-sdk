// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link RefreshDeviceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshDeviceCredentialResponseBody</p>
 */
public class RefreshDeviceCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceCredential")
    private DeviceCredential deviceCredential;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshDeviceCredentialResponseBody(Builder builder) {
        this.deviceCredential = builder.deviceCredential;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshDeviceCredentialResponseBody create() {
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
         * <p>The access credential of the device.</p>
         */
        public Builder deviceCredential(DeviceCredential deviceCredential) {
            this.deviceCredential = deviceCredential;
            return this;
        }

        /**
         * <p>The request ID. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>E4581CCF-62AF-44D9-B5B4-D1DBDC0F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshDeviceCredentialResponseBody build() {
            return new RefreshDeviceCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefreshDeviceCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>RefreshDeviceCredentialResponseBody</p>
     */
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
             * <p>The client ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test@@@test</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the access credential of the device was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1605541382000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The AccessKey ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>DC.Z5fXh9sRRVufyLi6wo****</p>
             */
            public Builder deviceAccessKeyId(String deviceAccessKeyId) {
                this.deviceAccessKeyId = deviceAccessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>DC.BJMkn4eMQJK2vaApTS****</p>
             */
            public Builder deviceAccessKeySecret(String deviceAccessKeySecret) {
                this.deviceAccessKeySecret = deviceAccessKeySecret;
                return this;
            }

            /**
             * <p>The ID of the ApsaraMQ for MQTT instance.</p>
             * 
             * <strong>example:</strong>
             * <p>post-cn-0pp12gl****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the access credential of the device was last updated. The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1605541382000</p>
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
