// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link GetDeviceInternetPortResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceInternetPortResponseBody</p>
 */
public class GetDeviceInternetPortResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("NetworkInfo")
    private java.util.List<NetworkInfo> networkInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<NetworkInfo> getNetworkInfo() {
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
        private java.util.List<NetworkInfo> networkInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeviceInternetPortResponseBody model) {
            this.instanceId = model.instanceId;
            this.networkInfo = model.networkInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the instance. The value is the ID of the server or container.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5sadvk2xnylvra9kyejcnevi6</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The network mapping information about the instance.</p>
         */
        public Builder networkInfo(java.util.List<NetworkInfo> networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36311833-83FC-57C3-A7DD-768F61F65555</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceInternetPortResponseBody build() {
            return new GetDeviceInternetPortResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceInternetPortResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceInternetPortResponseBody</p>
     */
    public static class NetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExternalIp")
        private String externalIp;

        @com.aliyun.core.annotation.NameInMap("ExternalPort")
        private String externalPort;

        @com.aliyun.core.annotation.NameInMap("ISP")
        private String ISP;

        @com.aliyun.core.annotation.NameInMap("InternalIp")
        private String internalIp;

        @com.aliyun.core.annotation.NameInMap("InternalPort")
        private String internalPort;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(NetworkInfo model) {
                this.externalIp = model.externalIp;
                this.externalPort = model.externalPort;
                this.ISP = model.ISP;
                this.internalIp = model.internalIp;
                this.internalPort = model.internalPort;
                this.status = model.status;
            } 

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>39.105.62.120</p>
             */
            public Builder externalIp(String externalIp) {
                this.externalIp = externalIp;
                return this;
            }

            /**
             * <p>The external port number.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder externalPort(String externalPort) {
                this.externalPort = externalPort;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP).</p>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * <p>The internal IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.49</p>
             */
            public Builder internalIp(String internalIp) {
                this.internalIp = internalIp;
                return this;
            }

            /**
             * <p>The internal port number.</p>
             * 
             * <strong>example:</strong>
             * <p>2020/2025</p>
             */
            public Builder internalPort(String internalPort) {
                this.internalPort = internalPort;
                return this;
            }

            /**
             * <p>The status of the external port.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
