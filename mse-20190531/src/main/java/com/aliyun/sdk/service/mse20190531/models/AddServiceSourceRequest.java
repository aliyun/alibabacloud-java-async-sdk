// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>AddServiceSourceRequest</p>
 */
public class AddServiceSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupList")
    private java.util.List < String > groupList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressOptionsRequest")
    private IngressOptionsRequest ingressOptionsRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathList")
    private java.util.List < String > pathList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToAuthorizeSecurityGroups")
    private java.util.List < ToAuthorizeSecurityGroups> toAuthorizeSecurityGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AddServiceSourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.address = builder.address;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.groupList = builder.groupList;
        this.ingressOptionsRequest = builder.ingressOptionsRequest;
        this.name = builder.name;
        this.pathList = builder.pathList;
        this.source = builder.source;
        this.toAuthorizeSecurityGroups = builder.toAuthorizeSecurityGroups;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddServiceSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return groupList
     */
    public java.util.List < String > getGroupList() {
        return this.groupList;
    }

    /**
     * @return ingressOptionsRequest
     */
    public IngressOptionsRequest getIngressOptionsRequest() {
        return this.ingressOptionsRequest;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pathList
     */
    public java.util.List < String > getPathList() {
        return this.pathList;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return toAuthorizeSecurityGroups
     */
    public java.util.List < ToAuthorizeSecurityGroups> getToAuthorizeSecurityGroups() {
        return this.toAuthorizeSecurityGroups;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddServiceSourceRequest, Builder> {
        private String acceptLanguage; 
        private String address; 
        private String gatewayUniqueId; 
        private java.util.List < String > groupList; 
        private IngressOptionsRequest ingressOptionsRequest; 
        private String name; 
        private java.util.List < String > pathList; 
        private String source; 
        private java.util.List < ToAuthorizeSecurityGroups> toAuthorizeSecurityGroups; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddServiceSourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.address = request.address;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.groupList = request.groupList;
            this.ingressOptionsRequest = request.ingressOptionsRequest;
            this.name = request.name;
            this.pathList = request.pathList;
            this.source = request.source;
            this.toAuthorizeSecurityGroups = request.toAuthorizeSecurityGroups;
            this.type = request.type;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN (default): Chinese</li>
         * <li>en-US: English</li>
         * <li>ja: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to monitor Ingress classes.</p>
         * 
         * <strong>example:</strong>
         * <p>c9ad2a0717032427e920754e25b49e3b5</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>Specifies whether to update the Ingress status.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-c70622ff52fe49beb29bea9a6f52****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The data structure.</p>
         */
        public Builder groupList(java.util.List < String > groupList) {
            String groupListShrink = shrink(groupList, "GroupList", "json");
            this.putQueryParameter("GroupList", groupListShrink);
            this.groupList = groupList;
            return this;
        }

        /**
         * <p>The list of service groups.</p>
         */
        public Builder ingressOptionsRequest(IngressOptionsRequest ingressOptionsRequest) {
            String ingressOptionsRequestShrink = shrink(ingressOptionsRequest, "IngressOptionsRequest", "json");
            this.putQueryParameter("IngressOptionsRequest", ingressOptionsRequestShrink);
            this.ingressOptionsRequest = ingressOptionsRequest;
            return this;
        }

        /**
         * <p>The namespace whose resources you want to monitor.</p>
         * 
         * <strong>example:</strong>
         * <p>istio</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         */
        public Builder pathList(java.util.List < String > pathList) {
            String pathListShrink = shrink(pathList, "PathList", "json");
            this.putQueryParameter("PathList", pathListShrink);
            this.pathList = pathList;
            return this;
        }

        /**
         * <p>The service source.</p>
         * <ul>
         * <li>K8s: ACK cluster</li>
         * <li>NACOS: MSE Nacos instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>K8s,MSE</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The list of security groups to be authorized. You can specify security groups to allow backend services to access data sources that you create.</p>
         */
        public Builder toAuthorizeSecurityGroups(java.util.List < ToAuthorizeSecurityGroups> toAuthorizeSecurityGroups) {
            String toAuthorizeSecurityGroupsShrink = shrink(toAuthorizeSecurityGroups, "ToAuthorizeSecurityGroups", "json");
            this.putQueryParameter("ToAuthorizeSecurityGroups", toAuthorizeSecurityGroupsShrink);
            this.toAuthorizeSecurityGroups = toAuthorizeSecurityGroups;
            return this;
        }

        /**
         * <p>The type of the service source.</p>
         * <ul>
         * <li>K8s: Container Service for Kubernetes (ACK) cluster</li>
         * <li>NACOS: Nacos instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The Ingress configuration.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddServiceSourceRequest build() {
            return new AddServiceSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddServiceSourceRequest} extends {@link TeaModel}
     *
     * <p>AddServiceSourceRequest</p>
     */
    public static class IngressOptionsRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableIngress")
        private Boolean enableIngress;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private Boolean enableStatus;

        @com.aliyun.core.annotation.NameInMap("IngressClass")
        private String ingressClass;

        @com.aliyun.core.annotation.NameInMap("WatchNamespace")
        private String watchNamespace;

        private IngressOptionsRequest(Builder builder) {
            this.enableIngress = builder.enableIngress;
            this.enableStatus = builder.enableStatus;
            this.ingressClass = builder.ingressClass;
            this.watchNamespace = builder.watchNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressOptionsRequest create() {
            return builder().build();
        }

        /**
         * @return enableIngress
         */
        public Boolean getEnableIngress() {
            return this.enableIngress;
        }

        /**
         * @return enableStatus
         */
        public Boolean getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return ingressClass
         */
        public String getIngressClass() {
            return this.ingressClass;
        }

        /**
         * @return watchNamespace
         */
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

        public static final class Builder {
            private Boolean enableIngress; 
            private Boolean enableStatus; 
            private String ingressClass; 
            private String watchNamespace; 

            /**
             * <p>The group to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * <p>The language of the response. Valid values:</p>
             * <ul>
             * <li>zh-CN: Chinese. This is the default value.</li>
             * <li>en-US: English.</li>
             * <li>ja: Japanese.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>An array of service root paths.</p>
             * 
             * <strong>example:</strong>
             * <p>com.test.xxx</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>The root path of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder watchNamespace(String watchNamespace) {
                this.watchNamespace = watchNamespace;
                return this;
            }

            public IngressOptionsRequest build() {
                return new IngressOptionsRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddServiceSourceRequest} extends {@link TeaModel}
     *
     * <p>AddServiceSourceRequest</p>
     */
    public static class ToAuthorizeSecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private ToAuthorizeSecurityGroups(Builder builder) {
            this.description = builder.description;
            this.portRange = builder.portRange;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToAuthorizeSecurityGroups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String description; 
            private String portRange; 
            private String securityGroupId; 

            /**
             * <p>The description of the authorization record.</p>
             * 
             * <strong>example:</strong>
             * <p>rule for xxx</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The authorized port range of the security group. You can select multiple port ranges. Separate each port range with a comma (,).</p>
             * 
             * <strong>example:</strong>
             * <p>8080/8080,9000/10000</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1acepclex0vmi1****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public ToAuthorizeSecurityGroups build() {
                return new ToAuthorizeSecurityGroups(this);
            } 

        } 

    }
}
