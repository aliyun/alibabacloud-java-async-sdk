// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNetworkDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkDomainsResponseBody</p>
 */
public class ListNetworkDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkDomains")
    private java.util.List < NetworkDomains> networkDomains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListNetworkDomainsResponseBody(Builder builder) {
        this.networkDomains = builder.networkDomains;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkDomains
     */
    public java.util.List < NetworkDomains> getNetworkDomains() {
        return this.networkDomains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < NetworkDomains> networkDomains; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The network domains that are returned.</p>
         */
        public Builder networkDomains(java.util.List < NetworkDomains> networkDomains) {
            this.networkDomains = networkDomains;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of network domains that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkDomainsResponseBody build() {
            return new ListNetworkDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkDomainsResponseBody</p>
     */
    public static class ProxiesState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("ProxyState")
        private String proxyState;

        private ProxiesState(Builder builder) {
            this.nodeType = builder.nodeType;
            this.proxyState = builder.proxyState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxiesState create() {
            return builder().build();
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return proxyState
         */
        public String getProxyState() {
            return this.proxyState;
        }

        public static final class Builder {
            private String nodeType; 
            private String proxyState; 

            /**
             * <p>The node type of the proxy server. Valid values:</p>
             * <ul>
             * <li><strong>Master</strong>: primary proxy server.</li>
             * <li><strong>Slave</strong>: secondary proxy server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The status of the proxy server.</p>
             * <ul>
             * <li><strong>Available</strong></li>
             * <li><strong>Unavailable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder proxyState(String proxyState) {
                this.proxyState = proxyState;
                return this;
            }

            public ProxiesState build() {
                return new ProxiesState(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNetworkDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkDomainsResponseBody</p>
     */
    public static class NetworkDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
        private String networkDomainId;

        @com.aliyun.core.annotation.NameInMap("NetworkDomainName")
        private String networkDomainName;

        @com.aliyun.core.annotation.NameInMap("NetworkDomainType")
        private String networkDomainType;

        @com.aliyun.core.annotation.NameInMap("ProxiesState")
        private java.util.List < ProxiesState> proxiesState;

        private NetworkDomains(Builder builder) {
            this.comment = builder.comment;
            this._default = builder._default;
            this.networkDomainId = builder.networkDomainId;
            this.networkDomainName = builder.networkDomainName;
            this.networkDomainType = builder.networkDomainType;
            this.proxiesState = builder.proxiesState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkDomains create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return networkDomainId
         */
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        /**
         * @return networkDomainName
         */
        public String getNetworkDomainName() {
            return this.networkDomainName;
        }

        /**
         * @return networkDomainType
         */
        public String getNetworkDomainType() {
            return this.networkDomainType;
        }

        /**
         * @return proxiesState
         */
        public java.util.List < ProxiesState> getProxiesState() {
            return this.proxiesState;
        }

        public static final class Builder {
            private String comment; 
            private Boolean _default; 
            private String networkDomainId; 
            private String networkDomainName; 
            private String networkDomainType; 
            private java.util.List < ProxiesState> proxiesState; 

            /**
             * <p>The remarks of the network domain.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Indicates whether the network domain is built-in.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>The network domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder networkDomainId(String networkDomainId) {
                this.networkDomainId = networkDomainId;
                return this;
            }

            /**
             * <p>The name of the network domain.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder networkDomainName(String networkDomainName) {
                this.networkDomainName = networkDomainName;
                return this;
            }

            /**
             * <p>The connection mode of the network domain. Valid values:</p>
             * <ul>
             * <li><strong>Direct</strong></li>
             * <li><strong>Proxy</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Proxy</p>
             */
            public Builder networkDomainType(String networkDomainType) {
                this.networkDomainType = networkDomainType;
                return this;
            }

            /**
             * ProxiesState.
             */
            public Builder proxiesState(java.util.List < ProxiesState> proxiesState) {
                this.proxiesState = proxiesState;
                return this;
            }

            public NetworkDomains build() {
                return new NetworkDomains(this);
            } 

        } 

    }
}
