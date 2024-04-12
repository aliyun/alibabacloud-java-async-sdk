// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNetworkDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkDomainResponseBody</p>
 */
public class GetNetworkDomainResponseBody extends TeaModel {
    @NameInMap("NetworkDomain")
    private NetworkDomain networkDomain;

    @NameInMap("RequestId")
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

        /**
         * NetworkDomain.
         */
        public Builder networkDomain(NetworkDomain networkDomain) {
            this.networkDomain = networkDomain;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkDomainResponseBody build() {
            return new GetNetworkDomainResponseBody(this);
        } 

    } 

    public static class Proxies extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("HasPassword")
        private Boolean hasPassword;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ProxyState")
        private String proxyState;

        @NameInMap("ProxyStateErrorCode")
        private String proxyStateErrorCode;

        @NameInMap("ProxyType")
        private String proxyType;

        @NameInMap("User")
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

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * HasPassword.
             */
            public Builder hasPassword(Boolean hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ProxyState.
             */
            public Builder proxyState(String proxyState) {
                this.proxyState = proxyState;
                return this;
            }

            /**
             * ProxyStateErrorCode.
             */
            public Builder proxyStateErrorCode(String proxyStateErrorCode) {
                this.proxyStateErrorCode = proxyStateErrorCode;
                return this;
            }

            /**
             * ProxyType.
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            /**
             * User.
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
    public static class NetworkDomain extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Default")
        private Boolean _default;

        @NameInMap("NetworkDomainId")
        private String networkDomainId;

        @NameInMap("NetworkDomainName")
        private String networkDomainName;

        @NameInMap("NetworkDomainType")
        private String networkDomainType;

        @NameInMap("Proxies")
        private java.util.List < Proxies> proxies;

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
        public java.util.List < Proxies> getProxies() {
            return this.proxies;
        }

        public static final class Builder {
            private String comment; 
            private Boolean _default; 
            private String networkDomainId; 
            private String networkDomainName; 
            private String networkDomainType; 
            private java.util.List < Proxies> proxies; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Default.
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * NetworkDomainId.
             */
            public Builder networkDomainId(String networkDomainId) {
                this.networkDomainId = networkDomainId;
                return this;
            }

            /**
             * NetworkDomainName.
             */
            public Builder networkDomainName(String networkDomainName) {
                this.networkDomainName = networkDomainName;
                return this;
            }

            /**
             * NetworkDomainType.
             */
            public Builder networkDomainType(String networkDomainType) {
                this.networkDomainType = networkDomainType;
                return this;
            }

            /**
             * Proxies.
             */
            public Builder proxies(java.util.List < Proxies> proxies) {
                this.proxies = proxies;
                return this;
            }

            public NetworkDomain build() {
                return new NetworkDomain(this);
            } 

        } 

    }
}
