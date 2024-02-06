// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceInternetPortResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceInternetPortResponseBody</p>
 */
public class GetDeviceInternetPortResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("NetworkInfo")
    private java.util.List < NetworkInfo> networkInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceInternetPortResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.networkInfo = builder.networkInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceInternetPortResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkInfo
     */
    public java.util.List < NetworkInfo> getNetworkInfo() {
        return this.networkInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private java.util.List < NetworkInfo> networkInfo; 
        private String requestId; 

        /**
         * The ID of the instance. The value is the ID of the server or container.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The network mapping information about the instance.
         */
        public Builder networkInfo(java.util.List < NetworkInfo> networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceInternetPortResponseBody build() {
            return new GetDeviceInternetPortResponseBody(this);
        } 

    } 

    public static class NetworkInfo extends TeaModel {
        @NameInMap("ExternalIp")
        private String externalIp;

        @NameInMap("ExternalPort")
        private String externalPort;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("InternalIp")
        private String internalIp;

        @NameInMap("InternalPort")
        private String internalPort;

        @NameInMap("Status")
        private String status;

        private NetworkInfo(Builder builder) {
            this.externalIp = builder.externalIp;
            this.externalPort = builder.externalPort;
            this.ISP = builder.ISP;
            this.internalIp = builder.internalIp;
            this.internalPort = builder.internalPort;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfo create() {
            return builder().build();
        }

        /**
         * @return externalIp
         */
        public String getExternalIp() {
            return this.externalIp;
        }

        /**
         * @return externalPort
         */
        public String getExternalPort() {
            return this.externalPort;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return internalIp
         */
        public String getInternalIp() {
            return this.internalIp;
        }

        /**
         * @return internalPort
         */
        public String getInternalPort() {
            return this.internalPort;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String externalIp; 
            private String externalPort; 
            private String ISP; 
            private String internalIp; 
            private String internalPort; 
            private String status; 

            /**
             * The public IP address.
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * The external port number.
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * The Internet service provider (ISP).
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The internal IP address.
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * The internal port number.
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * The status of the external port.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
}
