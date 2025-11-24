// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshProxyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshProxyStatusResponseBody</p>
 */
public class DescribeServiceMeshProxyStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProxyStatus")
    private java.util.List<ProxyStatus> proxyStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ProxyStatus> getProxyStatus() {
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
        private java.util.List<ProxyStatus> proxyStatus; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeServiceMeshProxyStatusResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.proxyStatus = model.proxyStatus;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. Valid values:</p>
         * <p><code>200</code>: The operation is successful.</p>
         * <ul>
         * <li><code>403</code>: You are not authorized to perform this operation.</li>
         * <li><code>503</code>: A backend server error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about the status of the proxies on the data plane.</p>
         */
        public Builder proxyStatus(java.util.List<ProxyStatus> proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeServiceMeshProxyStatusResponseBody build() {
            return new DescribeServiceMeshProxyStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshProxyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshProxyStatusResponseBody</p>
     */
    public static class ProxyStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterSynced")
        private String clusterSynced;

        @com.aliyun.core.annotation.NameInMap("EndpointPercent")
        private String endpointPercent;

        @com.aliyun.core.annotation.NameInMap("EndpointSynced")
        private String endpointSynced;

        @com.aliyun.core.annotation.NameInMap("IstioVersion")
        private String istioVersion;

        @com.aliyun.core.annotation.NameInMap("ListenerSynced")
        private String listenerSynced;

        @com.aliyun.core.annotation.NameInMap("ProxyId")
        private String proxyId;

        @com.aliyun.core.annotation.NameInMap("ProxyVersion")
        private String proxyVersion;

        @com.aliyun.core.annotation.NameInMap("RouteSynced")
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

            private Builder() {
            } 

            private Builder(ProxyStatus model) {
                this.clusterSynced = model.clusterSynced;
                this.endpointPercent = model.endpointPercent;
                this.endpointSynced = model.endpointSynced;
                this.istioVersion = model.istioVersion;
                this.listenerSynced = model.listenerSynced;
                this.proxyId = model.proxyId;
                this.proxyVersion = model.proxyVersion;
                this.routeSynced = model.routeSynced;
            } 

            /**
             * <p>The update status of the proxy. Valid values:</p>
             * <ul>
             * <li><code>SYNCED</code>: The status of the proxy is updated.</li>
             * <li><code>NOT SENT</code>: The status of the proxy is not updated.</li>
             * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the proxy but receives no response.</li>
             * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the proxy but receives no response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNCED</p>
             */
            public Builder clusterSynced(String clusterSynced) {
                this.clusterSynced = clusterSynced;
                return this;
            }

            /**
             * <p>The percentage of the updated endpoints.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endpointPercent(String endpointPercent) {
                this.endpointPercent = endpointPercent;
                return this;
            }

            /**
             * <p>The update status of the endpoint. Valid values:</p>
             * <ul>
             * <li><code>SYNCED</code>: The status of the endpoint is updated.</li>
             * <li><code>NOT SENT</code>: The status of the endpoint is not updated.</li>
             * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the endpoint but receives no response.</li>
             * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the endpoint but receives no response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNCED</p>
             */
            public Builder endpointSynced(String endpointSynced) {
                this.endpointSynced = endpointSynced;
                return this;
            }

            /**
             * <p>The version of Istiod.</p>
             * 
             * <strong>example:</strong>
             * <p>1.9.7</p>
             */
            public Builder istioVersion(String istioVersion) {
                this.istioVersion = istioVersion;
                return this;
            }

            /**
             * <p>The update status of the listener. Valid values:</p>
             * <ul>
             * <li><code>SYNCED</code>: The status of the listener is updated.</li>
             * <li><code>NOT SENT</code>: The status of the listener is not updated.</li>
             * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the listener but receives no response.</li>
             * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the listener but receives no response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNCED</p>
             */
            public Builder listenerSynced(String listenerSynced) {
                this.listenerSynced = listenerSynced;
                return this;
            }

            /**
             * <p>The ID of the proxy on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>119q****</p>
             */
            public Builder proxyId(String proxyId) {
                this.proxyId = proxyId;
                return this;
            }

            /**
             * <p>The version number of a proxy on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>1.9.7</p>
             */
            public Builder proxyVersion(String proxyVersion) {
                this.proxyVersion = proxyVersion;
                return this;
            }

            /**
             * <p>The update status of the route. Valid values:</p>
             * <ul>
             * <li><code>SYNCED</code>: The status of the route is updated.</li>
             * <li><code>NOT SENT</code>: The status of the route is not updated.</li>
             * <li><code>STALE (Never Acknowledged)</code>: Istiod has sent multiple requests to the Envoy proxy to update the status of the route but receives no response.</li>
             * <li><code>STALE</code>: Istiod has sent a request to the Envoy proxy to update the status of the route but receives no response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYNCED</p>
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
