// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppRequest</p>
 */
public class UpdateAppRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("applyReason")
    private String applyReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authentication")
    private Authentication authentication;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contactInfo")
    private String contactInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limiterInfo")
    private LimiterInfo limiterInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("network")
    private java.util.List < Network> network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("privateNetwork")
    private java.util.List < PrivateNetwork> privateNetwork;

    private UpdateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.applyReason = builder.applyReason;
        this.authentication = builder.authentication;
        this.contactInfo = builder.contactInfo;
        this.description = builder.description;
        this.limiterInfo = builder.limiterInfo;
        this.network = builder.network;
        this.privateNetwork = builder.privateNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppRequest create() {
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
     * @return applyReason
     */
    public String getApplyReason() {
        return this.applyReason;
    }

    /**
     * @return authentication
     */
    public Authentication getAuthentication() {
        return this.authentication;
    }

    /**
     * @return contactInfo
     */
    public String getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return limiterInfo
     */
    public LimiterInfo getLimiterInfo() {
        return this.limiterInfo;
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

    public static final class Builder extends Request.Builder<UpdateAppRequest, Builder> {
        private String appName; 
        private String applyReason; 
        private Authentication authentication; 
        private String contactInfo; 
        private String description; 
        private LimiterInfo limiterInfo; 
        private java.util.List < Network> network; 
        private java.util.List < PrivateNetwork> privateNetwork; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.applyReason = request.applyReason;
            this.authentication = request.authentication;
            this.contactInfo = request.contactInfo;
            this.description = request.description;
            this.limiterInfo = request.limiterInfo;
            this.network = request.network;
            this.privateNetwork = request.privateNetwork;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * applyReason.
         */
        public Builder applyReason(String applyReason) {
            this.putBodyParameter("applyReason", applyReason);
            this.applyReason = applyReason;
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
         * contactInfo.
         */
        public Builder contactInfo(String contactInfo) {
            this.putBodyParameter("contactInfo", contactInfo);
            this.contactInfo = contactInfo;
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
         * limiterInfo.
         */
        public Builder limiterInfo(LimiterInfo limiterInfo) {
            this.putBodyParameter("limiterInfo", limiterInfo);
            this.limiterInfo = limiterInfo;
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

        @Override
        public UpdateAppRequest build() {
            return new UpdateAppRequest(this);
        } 

    } 

    public static class BasicAuth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("username")
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
        @com.aliyun.core.annotation.NameInMap("basicAuth")
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
    public static class Limiters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Integer maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Integer minValue;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List < String > values;

        private Limiters(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Limiters create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Integer getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Integer getMinValue() {
            return this.minValue;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private Integer maxValue; 
            private Integer minValue; 
            private String type; 
            private java.util.List < String > values; 

            /**
             * maxValue.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
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
             * values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Limiters build() {
                return new Limiters(this);
            } 

        } 

    }
    public static class LimiterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limiters")
        private java.util.List < Limiters> limiters;

        private LimiterInfo(Builder builder) {
            this.limiters = builder.limiters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimiterInfo create() {
            return builder().build();
        }

        /**
         * @return limiters
         */
        public java.util.List < Limiters> getLimiters() {
            return this.limiters;
        }

        public static final class Builder {
            private java.util.List < Limiters> limiters; 

            /**
             * limiters.
             */
            public Builder limiters(java.util.List < Limiters> limiters) {
                this.limiters = limiters;
                return this;
            }

            public LimiterInfo build() {
                return new LimiterInfo(this);
            } 

        } 

    }
    public static class WhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
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
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
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
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
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
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("pvlEndpointId")
        private String pvlEndpointId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
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
}
