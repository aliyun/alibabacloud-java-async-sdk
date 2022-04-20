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
         * ProxyStatus.
         */
        public Builder proxyStatus(java.util.List < ProxyStatus> proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * ClusterSynced.
             */
            public Builder clusterSynced(String clusterSynced) {
                this.clusterSynced = clusterSynced;
                return this;
            }

            /**
             * EndpointPercent.
             */
            public Builder endpointPercent(String endpointPercent) {
                this.endpointPercent = endpointPercent;
                return this;
            }

            /**
             * EndpointSynced.
             */
            public Builder endpointSynced(String endpointSynced) {
                this.endpointSynced = endpointSynced;
                return this;
            }

            /**
             * IstioVersion.
             */
            public Builder istioVersion(String istioVersion) {
                this.istioVersion = istioVersion;
                return this;
            }

            /**
             * ListenerSynced.
             */
            public Builder listenerSynced(String listenerSynced) {
                this.listenerSynced = listenerSynced;
                return this;
            }

            /**
             * ProxyId.
             */
            public Builder proxyId(String proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * ProxyVersion.
             */
            public Builder proxyVersion(String proxyVersion) {
                this.proxyVersion = proxyVersion;
                return this;
            }

            /**
             * RouteSynced.
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
