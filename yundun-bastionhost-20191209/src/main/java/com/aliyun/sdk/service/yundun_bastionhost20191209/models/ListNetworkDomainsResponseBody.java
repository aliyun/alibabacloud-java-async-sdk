// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkDomainsResponseBody</p>
 */
public class ListNetworkDomainsResponseBody extends TeaModel {
    @NameInMap("NetworkDomains")
    private java.util.List < NetworkDomains> networkDomains;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * NetworkDomains.
         */
        public Builder networkDomains(java.util.List < NetworkDomains> networkDomains) {
            this.networkDomains = networkDomains;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkDomainsResponseBody build() {
            return new ListNetworkDomainsResponseBody(this);
        } 

    } 

    public static class ProxiesState extends TeaModel {
        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("ProxyState")
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
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * ProxyState.
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
    public static class NetworkDomains extends TeaModel {
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

        @NameInMap("ProxiesState")
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
