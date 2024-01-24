// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @Body
    @NameInMap("appName")
    private String appName;

    @Body
    @NameInMap("authentication")
    private Authentication authentication;

    @Body
    @NameInMap("chargeType")
    private String chargeType;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("network")
    private java.util.List < Network> network;

    @Body
    @NameInMap("privateNetwork")
    private java.util.List < PrivateNetwork> privateNetwork;

    @Body
    @NameInMap("quotaInfo")
    private QuotaInfo quotaInfo;

    @Body
    @NameInMap("regionId")
    private String regionId;

    @Body
    @NameInMap("version")
    private String version;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.authentication = builder.authentication;
        this.chargeType = builder.chargeType;
        this.description = builder.description;
        this.network = builder.network;
        this.privateNetwork = builder.privateNetwork;
        this.quotaInfo = builder.quotaInfo;
        this.regionId = builder.regionId;
        this.version = builder.version;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return authentication
     */
    public Authentication getAuthentication() {
        return this.authentication;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return network
     */
    public java.util.List < Network> getNetwork() {
        return this.network;
    }

    /**
     * @return privateNetwork
     */
    public java.util.List < PrivateNetwork> getPrivateNetwork() {
        return this.privateNetwork;
    }

    /**
     * @return quotaInfo
     */
    public QuotaInfo getQuotaInfo() {
        return this.quotaInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private Authentication authentication; 
        private String chargeType; 
        private String description; 
        private java.util.List < Network> network; 
        private java.util.List < PrivateNetwork> privateNetwork; 
        private QuotaInfo quotaInfo; 
        private String regionId; 
        private String version; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.authentication = request.authentication;
            this.chargeType = request.chargeType;
            this.description = request.description;
            this.network = request.network;
            this.privateNetwork = request.privateNetwork;
            this.quotaInfo = request.quotaInfo;
            this.regionId = request.regionId;
            this.version = request.version;
            this.dryRun = request.dryRun;
        } 

        /**
         * 应用名
         */
        public Builder appName(String appName) {
            this.putBodyParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * authentication.
         */
        public Builder authentication(Authentication authentication) {
            this.putBodyParameter("authentication", authentication);
            this.authentication = authentication;
            return this;
        }

        /**
         * chargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * 应用备注
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * network.
         */
        public Builder network(java.util.List < Network> network) {
            this.putBodyParameter("network", network);
            this.network = network;
            return this;
        }

        /**
         * privateNetwork.
         */
        public Builder privateNetwork(java.util.List < PrivateNetwork> privateNetwork) {
            this.putBodyParameter("privateNetwork", privateNetwork);
            this.privateNetwork = privateNetwork;
            return this;
        }

        /**
         * quotaInfo.
         */
        public Builder quotaInfo(QuotaInfo quotaInfo) {
            this.putBodyParameter("quotaInfo", quotaInfo);
            this.quotaInfo = quotaInfo;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

    public static class BasicAuth extends TeaModel {
        @NameInMap("password")
        private String password;

        @NameInMap("username")
        private String username;

        private BasicAuth(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicAuth create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String password; 
            private String username; 

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public BasicAuth build() {
                return new BasicAuth(this);
            } 

        } 

    }
    public static class Authentication extends TeaModel {
        @NameInMap("basicAuth")
        private java.util.List < BasicAuth> basicAuth;

        private Authentication(Builder builder) {
            this.basicAuth = builder.basicAuth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authentication create() {
            return builder().build();
        }

        /**
         * @return basicAuth
         */
        public java.util.List < BasicAuth> getBasicAuth() {
            return this.basicAuth;
        }

        public static final class Builder {
            private java.util.List < BasicAuth> basicAuth; 

            /**
             * basicAuth.
             */
            public Builder basicAuth(java.util.List < BasicAuth> basicAuth) {
                this.basicAuth = basicAuth;
                return this;
            }

            public Authentication build() {
                return new Authentication(this);
            } 

        } 

    }
    public static class WhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        private String groupName;

        @NameInMap("ips")
        private java.util.List < String > ips;

        private WhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroup create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            public WhiteIpGroup build() {
                return new WhiteIpGroup(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @NameInMap("domain")
        private String domain;

        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("port")
        private Integer port;

        @NameInMap("type")
        private String type;

        @NameInMap("whiteIpGroup")
        private java.util.List < WhiteIpGroup> whiteIpGroup;

        private Network(Builder builder) {
            this.domain = builder.domain;
            this.enabled = builder.enabled;
            this.port = builder.port;
            this.type = builder.type;
            this.whiteIpGroup = builder.whiteIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whiteIpGroup
         */
        public java.util.List < WhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enabled; 
            private Integer port; 
            private String type; 
            private java.util.List < WhiteIpGroup> whiteIpGroup; 

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * whiteIpGroup.
             */
            public Builder whiteIpGroup(java.util.List < WhiteIpGroup> whiteIpGroup) {
                this.whiteIpGroup = whiteIpGroup;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class PrivateNetworkWhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        private String groupName;

        @NameInMap("ips")
        private java.util.List < String > ips;

        private PrivateNetworkWhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateNetworkWhiteIpGroup create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            public PrivateNetworkWhiteIpGroup build() {
                return new PrivateNetworkWhiteIpGroup(this);
            } 

        } 

    }
    public static class PrivateNetwork extends TeaModel {
        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("pvlEndpointId")
        private String pvlEndpointId;

        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("whiteIpGroup")
        private java.util.List < PrivateNetworkWhiteIpGroup> whiteIpGroup;

        private PrivateNetwork(Builder builder) {
            this.enabled = builder.enabled;
            this.pvlEndpointId = builder.pvlEndpointId;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.whiteIpGroup = builder.whiteIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateNetwork create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return pvlEndpointId
         */
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return whiteIpGroup
         */
        public java.util.List < PrivateNetworkWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String pvlEndpointId; 
            private String type; 
            private String vpcId; 
            private java.util.List < PrivateNetworkWhiteIpGroup> whiteIpGroup; 

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * pvlEndpointId.
             */
            public Builder pvlEndpointId(String pvlEndpointId) {
                this.pvlEndpointId = pvlEndpointId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * whiteIpGroup.
             */
            public Builder whiteIpGroup(java.util.List < PrivateNetworkWhiteIpGroup> whiteIpGroup) {
                this.whiteIpGroup = whiteIpGroup;
                return this;
            }

            public PrivateNetwork build() {
                return new PrivateNetwork(this);
            } 

        } 

    }
    public static class QuotaInfo extends TeaModel {
        @NameInMap("appType")
        private String appType;

        @NameInMap("cu")
        private Integer cu;

        @NameInMap("storage")
        private Integer storage;

        private QuotaInfo(Builder builder) {
            this.appType = builder.appType;
            this.cu = builder.cu;
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaInfo create() {
            return builder().build();
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private String appType; 
            private Integer cu; 
            private Integer storage; 

            /**
             * appType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            public QuotaInfo build() {
                return new QuotaInfo(this);
            } 

        } 

    }
}
