// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>AddAiotDevicesResponseBody</p>
 */
public class AddAiotDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultList")
    private java.util.List < ResultList> resultList;

    private AddAiotDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAiotDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return resultList
     */
    public java.util.List < ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < ResultList> resultList; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultList.
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public AddAiotDevicesResponseBody build() {
            return new AddAiotDevicesResponseBody(this);
        } 

    } 

    public static class ResultList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Id")
        private String id;

        @NameInMap("Message")
        private String message;

        @NameInMap("Password")
        private String password;

        @NameInMap("ServerHost")
        private String serverHost;

        @NameInMap("ServerHostInternal")
        private String serverHostInternal;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerIpInternal")
        private String serverIpInternal;

        @NameInMap("ServerPort")
        private String serverPort;

        @NameInMap("ServerWssPort")
        private String serverWssPort;

        @NameInMap("UserId")
        private String userId;

        private ResultList(Builder builder) {
            this.code = builder.code;
            this.deviceId = builder.deviceId;
            this.id = builder.id;
            this.message = builder.message;
            this.password = builder.password;
            this.serverHost = builder.serverHost;
            this.serverHostInternal = builder.serverHostInternal;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverIpInternal = builder.serverIpInternal;
            this.serverPort = builder.serverPort;
            this.serverWssPort = builder.serverWssPort;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return serverHost
         */
        public String getServerHost() {
            return this.serverHost;
        }

        /**
         * @return serverHostInternal
         */
        public String getServerHostInternal() {
            return this.serverHostInternal;
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
         * @return serverIpInternal
         */
        public String getServerIpInternal() {
            return this.serverIpInternal;
        }

        /**
         * @return serverPort
         */
        public String getServerPort() {
            return this.serverPort;
        }

        /**
         * @return serverWssPort
         */
        public String getServerWssPort() {
            return this.serverWssPort;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String code; 
            private String deviceId; 
            private String id; 
            private String message; 
            private String password; 
            private String serverHost; 
            private String serverHostInternal; 
            private String serverId; 
            private String serverIp; 
            private String serverIpInternal; 
            private String serverPort; 
            private String serverWssPort; 
            private String userId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * ServerHost.
             */
            public Builder serverHost(String serverHost) {
                this.serverHost = serverHost;
                return this;
            }

            /**
             * ServerHostInternal.
             */
            public Builder serverHostInternal(String serverHostInternal) {
                this.serverHostInternal = serverHostInternal;
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
             * ServerIpInternal.
             */
            public Builder serverIpInternal(String serverIpInternal) {
                this.serverIpInternal = serverIpInternal;
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
             * ServerWssPort.
             */
            public Builder serverWssPort(String serverWssPort) {
                this.serverWssPort = serverWssPort;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
