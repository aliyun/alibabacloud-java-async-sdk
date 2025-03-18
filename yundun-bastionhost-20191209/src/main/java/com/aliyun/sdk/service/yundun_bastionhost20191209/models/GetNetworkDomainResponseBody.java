// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetNetworkDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkDomainResponseBody</p>
 */
public class GetNetworkDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkDomain")
    private NetworkDomain networkDomain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNetworkDomainResponseBody(Builder builder) {
        this.networkDomain = builder.networkDomain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkDomain
     */
    public NetworkDomain getNetworkDomain() {
        return this.networkDomain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkDomain networkDomain; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNetworkDomainResponseBody model) {
            this.networkDomain = model.networkDomain;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the network domain.</p>
         */
        public Builder networkDomain(NetworkDomain networkDomain) {
            this.networkDomain = networkDomain;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05F59944-2E24-595C-B21A-8C9955E60FAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkDomainResponseBody build() {
            return new GetNetworkDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNetworkDomainResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkDomainResponseBody</p>
     */
    public static class Proxies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("HasPassword")
        private Boolean hasPassword;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProxyState")
        private String proxyState;

        @com.aliyun.core.annotation.NameInMap("ProxyStateErrorCode")
        private String proxyStateErrorCode;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Proxies(Builder builder) {
            this.address = builder.address;
            this.hasPassword = builder.hasPassword;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.proxyState = builder.proxyState;
            this.proxyStateErrorCode = builder.proxyStateErrorCode;
            this.proxyType = builder.proxyType;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Proxies create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return hasPassword
         */
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return proxyState
         */
        public String getProxyState() {
            return this.proxyState;
        }

        /**
         * @return proxyStateErrorCode
         */
        public String getProxyStateErrorCode() {
            return this.proxyStateErrorCode;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String address; 
            private Boolean hasPassword; 
            private String nodeType; 
            private Integer port; 
            private String proxyState; 
            private String proxyStateErrorCode; 
            private String proxyType; 
            private String user; 

            private Builder() {
            } 

            private Builder(Proxies model) {
                this.address = model.address;
                this.hasPassword = model.hasPassword;
                this.nodeType = model.nodeType;
                this.port = model.port;
                this.proxyState = model.proxyState;
                this.proxyStateErrorCode = model.proxyStateErrorCode;
                this.proxyType = model.proxyType;
                this.user = model.user;
            } 

            /**
             * <p>The IP address of the proxy server.</p>
             * 
             * <strong>example:</strong>
             * <p><code>47.102.**.**</code></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Indicates whether the proxy server has a password. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

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
             * <p>The port of the proxy server.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * <p>Unavailable</p>
             */
            public Builder proxyState(String proxyState) {
                this.proxyState = proxyState;
                return this;
            }

            /**
             * <p>The error code that indicates the status of the proxy server.</p>
             * <ul>
             * <li><strong>CHECK_PWD_FAILED</strong>: The password is invalid.</li>
             * <li><strong>CHECK_PWD_TIMEOUT</strong>: The password verification session timed out.</li>
             * <li><strong>CHECK_PWD_NETWORK_ERR</strong>: A network error occurred.</li>
             * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHECK_PWD_TIMEOUT</p>
             */
            public Builder proxyStateErrorCode(String proxyStateErrorCode) {
                this.proxyStateErrorCode = proxyStateErrorCode;
                return this;
            }

            /**
             * <p>The proxy type. Valid values:</p>
             * <ul>
             * <li><strong>SSHProxy</strong></li>
             * <li><strong>HTTPProxy</strong></li>
             * <li><strong>Socks5Proxy</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTPProxy</p>
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * <p>The username of the proxy server.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Proxies build() {
                return new Proxies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNetworkDomainResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkDomainResponseBody</p>
     */
    public static class NetworkDomain extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Proxies")
        private java.util.List<Proxies> proxies;

        private NetworkDomain(Builder builder) {
            this.comment = builder.comment;
            this._default = builder._default;
            this.networkDomainId = builder.networkDomainId;
            this.networkDomainName = builder.networkDomainName;
            this.networkDomainType = builder.networkDomainType;
            this.proxies = builder.proxies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkDomain create() {
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
         * @return proxies
         */
        public java.util.List<Proxies> getProxies() {
            return this.proxies;
        }

        public static final class Builder {
            private String comment; 
            private Boolean _default; 
            private String networkDomainId; 
            private String networkDomainName; 
            private String networkDomainType; 
            private java.util.List<Proxies> proxies; 

            private Builder() {
            } 

            private Builder(NetworkDomain model) {
                this.comment = model.comment;
                this._default = model._default;
                this.networkDomainId = model.networkDomainId;
                this.networkDomainName = model.networkDomainName;
                this.networkDomainType = model.networkDomainType;
                this.proxies = model.proxies;
            } 

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
             * <p>Indicates whether the network domain is a built-in network domain.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>SSH Proxy</p>
             */
            public Builder networkDomainName(String networkDomainName) {
                this.networkDomainName = networkDomainName;
                return this;
            }

            /**
             * <p>The connection mode of the network domain. Valid values:</p>
             * <ul>
             * <li>Direct</li>
             * <li>Proxy</li>
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
             * <p>The information about the proxy servers.</p>
             */
            public Builder proxies(java.util.List<Proxies> proxies) {
                this.proxies = proxies;
                return this;
            }

            public NetworkDomain build() {
                return new NetworkDomain(this);
            } 

        } 

    }
}
