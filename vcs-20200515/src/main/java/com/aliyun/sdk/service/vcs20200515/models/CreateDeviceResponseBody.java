// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeviceResponseBody</p>
 */
public class CreateDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceResponseBody create() {
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

        public CreateDeviceResponseBody build() {
            return new CreateDeviceResponseBody(this);
        } 

    } 

    public static class SubDeviceInfo extends TeaModel {
        @NameInMap("SubDeviceId")
        private String subDeviceId;

        private SubDeviceInfo(Builder builder) {
            this.subDeviceId = builder.subDeviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return subDeviceId
         */
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

        public static final class Builder {
            private String subDeviceId; 

            /**
             * SubDeviceId.
             */
            public Builder subDeviceId(String subDeviceId) {
                this.subDeviceId = subDeviceId;
                return this;
            }

            public SubDeviceInfo build() {
                return new SubDeviceInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

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

        @NameInMap("SubDeviceInfo")
        private java.util.List < SubDeviceInfo> subDeviceInfo;

        private Data(Builder builder) {
            this.deviceId = builder.deviceId;
            this.password = builder.password;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverPort = builder.serverPort;
            this.serverRealm = builder.serverRealm;
            this.subDeviceInfo = builder.subDeviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
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
         * @return subDeviceInfo
         */
        public java.util.List < SubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

        public static final class Builder {
            private String deviceId; 
            private String password; 
            private String serverId; 
            private String serverIp; 
            private String serverPort; 
            private String serverRealm; 
            private java.util.List < SubDeviceInfo> subDeviceInfo; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
