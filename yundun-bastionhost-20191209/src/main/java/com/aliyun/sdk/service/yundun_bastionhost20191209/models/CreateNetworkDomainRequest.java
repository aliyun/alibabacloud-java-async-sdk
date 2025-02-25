// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkDomainRequest</p>
 */
public class CreateNetworkDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proxies")
    private java.util.List < Proxies> proxies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateNetworkDomainRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.networkDomainName = builder.networkDomainName;
        this.networkDomainType = builder.networkDomainType;
        this.proxies = builder.proxies;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateNetworkDomainRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String networkDomainName; 
        private String networkDomainType; 
        private java.util.List < Proxies> proxies; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkDomainRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.networkDomainName = request.networkDomainName;
            this.networkDomainType = request.networkDomainType;
            this.proxies = request.proxies;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The remarks of the network domain. The remarks can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the bastion host for which you want to create a network domain.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-lbj3bw4ma02</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the network domain that you want to create. The name can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkDomainName(String networkDomainName) {
            this.putQueryParameter("NetworkDomainName", networkDomainName);
            this.networkDomainName = networkDomainName;
            return this;
        }

        /**
         * <p>The connection mode of the network domain to be created. Valid values:</p>
         * <ul>
         * <li>Direct</li>
         * <li>Proxy</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Proxy</p>
         */
        public Builder networkDomainType(String networkDomainType) {
            this.putQueryParameter("NetworkDomainType", networkDomainType);
            this.networkDomainType = networkDomainType;
            return this;
        }

        /**
         * <p>The information about the proxy servers.</p>
         */
        public Builder proxies(java.util.List < Proxies> proxies) {
            this.putQueryParameter("Proxies", proxies);
            this.proxies = proxies;
            return this;
        }

        /**
         * <p>The region ID of the bastion host for which you want to create a network domain.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateNetworkDomainRequest build() {
            return new CreateNetworkDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkDomainRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkDomainRequest</p>
     */
    public static class Proxies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Proxies(Builder builder) {
            this.address = builder.address;
            this.nodeType = builder.nodeType;
            this.password = builder.password;
            this.port = builder.port;
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
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
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
            private String nodeType; 
            private String password; 
            private Integer port; 
            private String proxyType; 
            private String user; 

            /**
             * <p>The IP address of the proxy server.</p>
             * 
             * <strong>example:</strong>
             * <p><code>47.104.**.**</code></p>
             */
            public Builder address(String address) {
                this.address = address;
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
             * <p>The Base64-encoded password of the proxy server.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
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
             * <p>The proxy type. Valid values:</p>
             * <ul>
             * <li><strong>SSHProxy</strong></li>
             * <li><strong>HTTPProxy</strong></li>
             * <li><strong>Socks5Proxy</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SSHProxy</p>
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
}
