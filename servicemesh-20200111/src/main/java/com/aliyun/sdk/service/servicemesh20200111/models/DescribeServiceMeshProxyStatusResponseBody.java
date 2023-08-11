// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshProxyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshProxyStatusResponseBody</p>
 */
public class DescribeServiceMeshProxyStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("ProxyStatus")
    private java.util.List < ProxyStatus> proxyStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeServiceMeshProxyStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.proxyStatus = builder.proxyStatus;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshProxyStatusResponseBody create() {
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
     * @return proxyStatus
     */
    public java.util.List < ProxyStatus> getProxyStatus() {
        return this.proxyStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < ProxyStatus> proxyStatus; 
        private String requestId; 
        private String success; 

        /**
         * The status code. Valid values:
         * <p>
         * 
         * `200`: The status code returned because the operation is successful.
         * 
         * *   `403`: The status code returned because you are not authorized to perform this operation.
         * *   `503`: The status code returned because a backend server error occurs.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The information about the status of the proxies on the data plane.
         */
        public Builder proxyStatus(java.util.List < ProxyStatus> proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeServiceMeshProxyStatusResponseBody build() {
            return new DescribeServiceMeshProxyStatusResponseBody(this);
        } 

    } 

    public static class ProxyStatus extends TeaModel {
        @NameInMap("ClusterSynced")
        private String clusterSynced;

        @NameInMap("EndpointPercent")
        private String endpointPercent;

        @NameInMap("EndpointSynced")
        private String endpointSynced;

        @NameInMap("IstioVersion")
        private String istioVersion;

        @NameInMap("ListenerSynced")
        private String listenerSynced;

        @NameInMap("ProxyId")
        private String proxyId;

        @NameInMap("ProxyVersion")
        private String proxyVersion;

        @NameInMap("RouteSynced")
        private String routeSynced;

        private ProxyStatus(Builder builder) {
            this.clusterSynced = builder.clusterSynced;
            this.endpointPercent = builder.endpointPercent;
            this.endpointSynced = builder.endpointSynced;
            this.istioVersion = builder.istioVersion;
            this.listenerSynced = builder.listenerSynced;
            this.proxyId = builder.proxyId;
            this.proxyVersion = builder.proxyVersion;
            this.routeSynced = builder.routeSynced;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyStatus create() {
            return builder().build();
        }

        /**
         * @return clusterSynced
         */
        public String getClusterSynced() {
            return this.clusterSynced;
        }

        /**
         * @return endpointPercent
         */
        public String getEndpointPercent() {
            return this.endpointPercent;
        }

        /**
         * @return endpointSynced
         */
        public String getEndpointSynced() {
            return this.endpointSynced;
        }

        /**
         * @return istioVersion
         */
        public String getIstioVersion() {
            return this.istioVersion;
        }

        /**
         * @return listenerSynced
         */
        public String getListenerSynced() {
            return this.listenerSynced;
        }

        /**
         * @return proxyId
         */
        public String getProxyId() {
            return this.proxyId;
        }

        /**
         * @return proxyVersion
         */
        public String getProxyVersion() {
            return this.proxyVersion;
        }

        /**
         * @return routeSynced
         */
        public String getRouteSynced() {
            return this.routeSynced;
        }

        public static final class Builder {
            private String clusterSynced; 
            private String endpointPercent; 
            private String endpointSynced; 
            private String istioVersion; 
            private String listenerSynced; 
            private String proxyId; 
            private String proxyVersion; 
            private String routeSynced; 

            /**
             * The update status of the proxy. Valid values:
             * <p>
             * 
             * *   `SYNCED`: The status of the proxy is updated.
             * *   `NOT SENT`: The status of the proxy is not updated.
             * *   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the proxy but receives no response.
             * *   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the proxy but receives no response.
             */
            public Builder clusterSynced(String clusterSynced) {
                this.clusterSynced = clusterSynced;
                return this;
            }

            /**
             * The percentage of the updated endpoints.
             */
            public Builder endpointPercent(String endpointPercent) {
                this.endpointPercent = endpointPercent;
                return this;
            }

            /**
             * The update status of the endpoint. Valid values:
             * <p>
             * 
             * *   `SYNCED`: The status of the endpoint is updated.
             * *   `NOT SENT`: The status of the endpoint is not updated.
             * *   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the endpoint but receives no response.
             * *   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the endpoint but receives no response.
             */
            public Builder endpointSynced(String endpointSynced) {
                this.endpointSynced = endpointSynced;
                return this;
            }

            /**
             * The version of Istiod.
             */
            public Builder istioVersion(String istioVersion) {
                this.istioVersion = istioVersion;
                return this;
            }

            /**
             * The update status of the listener. Valid values:
             * <p>
             * 
             * *   `SYNCED`: The status of the listener is updated.
             * *   `NOT SENT`: The status of the listener is not updated.
             * *   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the listener but receives no response.
             * *   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the listener but receives no response.
             */
            public Builder listenerSynced(String listenerSynced) {
                this.listenerSynced = listenerSynced;
                return this;
            }

            /**
             * The ID of the proxy on the data plane.
             */
            public Builder proxyId(String proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * The version number of the proxy on the data plane.
             */
            public Builder proxyVersion(String proxyVersion) {
                this.proxyVersion = proxyVersion;
                return this;
            }

            /**
             * The update status of the route. Valid values:
             * <p>
             * 
             * *   `SYNCED`: The status of the route is updated.
             * *   `NOT SENT`: The status of the route is not updated.
             * *   `STALE (Never Acknowledged)`: Istiod has sent multiple requests to the Envoy proxy to update the status of the route but receives no response.
             * *   `STALE`: Istiod has sent a request to the Envoy proxy to update the status of the route but receives no response.
             */
            public Builder routeSynced(String routeSynced) {
                this.routeSynced = routeSynced;
                return this;
            }

            public ProxyStatus build() {
                return new ProxyStatus(this);
            } 

        } 

    }
}
