// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScanDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScanDeviceResponseBody</p>
 */
public class CreateScanDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateScanDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateScanDeviceResponseBody build() {
            return new CreateScanDeviceResponseBody(this);
        } 

    } 

    public static class SubDeviceInfo extends TeaModel {
        @NameInMap("ChannelDeviceId")
        private String channelDeviceId;

        private SubDeviceInfo(Builder builder) {
            this.channelDeviceId = builder.channelDeviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return channelDeviceId
         */
        public String getChannelDeviceId() {
            return this.channelDeviceId;
        }

        public static final class Builder {
            private String channelDeviceId; 

            /**
             * ChannelDeviceId.
             */
            public Builder channelDeviceId(String channelDeviceId) {
                this.channelDeviceId = channelDeviceId;
                return this;
            }

            public SubDeviceInfo build() {
                return new SubDeviceInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("Password")
        private String password;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerPort")
        private String serverPort;

        @NameInMap("ServerRealm")
        private String serverRealm;

        @NameInMap("SipDeviceGbId")
        private String sipDeviceGbId;

        @NameInMap("SubDeviceInfo")
        private java.util.List < SubDeviceInfo> subDeviceInfo;

        private Data(Builder builder) {
            this.corpId = builder.corpId;
            this.deviceId = builder.deviceId;
            this.deviceSn = builder.deviceSn;
            this.password = builder.password;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverPort = builder.serverPort;
            this.serverRealm = builder.serverRealm;
            this.sipDeviceGbId = builder.sipDeviceGbId;
            this.subDeviceInfo = builder.subDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceSn
         */
        public String getDeviceSn() {
            return this.deviceSn;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverPort
         */
        public String getServerPort() {
            return this.serverPort;
        }

        /**
         * @return serverRealm
         */
        public String getServerRealm() {
            return this.serverRealm;
        }

        /**
         * @return sipDeviceGbId
         */
        public String getSipDeviceGbId() {
            return this.sipDeviceGbId;
        }

        /**
         * @return subDeviceInfo
         */
        public java.util.List < SubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

        public static final class Builder {
            private String corpId; 
            private String deviceId; 
            private String deviceSn; 
            private String password; 
            private String serverId; 
            private String serverIp; 
            private String serverPort; 
            private String serverRealm; 
            private String sipDeviceGbId; 
            private java.util.List < SubDeviceInfo> subDeviceInfo; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceSn.
             */
            public Builder deviceSn(String deviceSn) {
                this.deviceSn = deviceSn;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * ServerPort.
             */
            public Builder serverPort(String serverPort) {
                this.serverPort = serverPort;
                return this;
            }

            /**
             * ServerRealm.
             */
            public Builder serverRealm(String serverRealm) {
                this.serverRealm = serverRealm;
                return this;
            }

            /**
             * SipDeviceGbId.
             */
            public Builder sipDeviceGbId(String sipDeviceGbId) {
                this.sipDeviceGbId = sipDeviceGbId;
                return this;
            }

            /**
             * SubDeviceInfo.
             */
            public Builder subDeviceInfo(java.util.List < SubDeviceInfo> subDeviceInfo) {
                this.subDeviceInfo = subDeviceInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
