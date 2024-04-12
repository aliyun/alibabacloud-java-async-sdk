// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkDomainRequest</p>
 */
public class CreateNetworkDomainRequest extends Request {
    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NetworkDomainName")
    @Validation(required = true)
    private String networkDomainName;

    @Query
    @NameInMap("NetworkDomainType")
    @Validation(required = true)
    private String networkDomainType;

    @Query
    @NameInMap("Proxies")
    private java.util.List < Proxies> proxies;

    @Query
    @NameInMap("RegionId")
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
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkDomainName.
         */
        public Builder networkDomainName(String networkDomainName) {
            this.putQueryParameter("NetworkDomainName", networkDomainName);
            this.networkDomainName = networkDomainName;
            return this;
        }

        /**
         * NetworkDomainType.
         */
        public Builder networkDomainType(String networkDomainType) {
            this.putQueryParameter("NetworkDomainType", networkDomainType);
            this.networkDomainType = networkDomainType;
            return this;
        }

        /**
         * Proxies.
         */
        public Builder proxies(java.util.List < Proxies> proxies) {
            this.putQueryParameter("Proxies", proxies);
            this.proxies = proxies;
            return this;
        }

        /**
         * RegionId.
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

    public static class Proxies extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Password")
        private String password;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ProxyType")
        private String proxyType;

        @NameInMap("User")
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
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
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
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
}
