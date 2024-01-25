// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>AddServiceSourceRequest</p>
 */
public class AddServiceSourceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("GroupList")
    private java.util.List < String > groupList;

    @Query
    @NameInMap("IngressOptionsRequest")
    private IngressOptionsRequest ingressOptionsRequest;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PathList")
    private java.util.List < String > pathList;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("ToAuthorizeSecurityGroups")
    private java.util.List < ToAuthorizeSecurityGroups> toAuthorizeSecurityGroups;

    @Query
    @NameInMap("Type")
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
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh-CN (default): Chinese
         * *   en-US: English
         * *   ja: Japanese
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to monitor Ingress classes.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Specifies whether to update the Ingress status.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The data structure.
         */
        public Builder groupList(java.util.List < String > groupList) {
            String groupListShrink = shrink(groupList, "GroupList", "json");
            this.putQueryParameter("GroupList", groupListShrink);
            this.groupList = groupList;
            return this;
        }

        /**
         * The list of service groups.
         */
        public Builder ingressOptionsRequest(IngressOptionsRequest ingressOptionsRequest) {
            String ingressOptionsRequestShrink = shrink(ingressOptionsRequest, "IngressOptionsRequest", "json");
            this.putQueryParameter("IngressOptionsRequest", ingressOptionsRequestShrink);
            this.ingressOptionsRequest = ingressOptionsRequest;
            return this;
        }

        /**
         * The namespace whose resources you want to monitor.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder pathList(java.util.List < String > pathList) {
            String pathListShrink = shrink(pathList, "PathList", "json");
            this.putQueryParameter("PathList", pathListShrink);
            this.pathList = pathList;
            return this;
        }

        /**
         * The service source.
         * <p>
         * 
         * *   K8s: ACK cluster
         * *   NACOS: MSE Nacos instance
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The list of security groups to be authorized. You can specify security groups to allow backend services to access data sources that you create.
         */
        public Builder toAuthorizeSecurityGroups(java.util.List < ToAuthorizeSecurityGroups> toAuthorizeSecurityGroups) {
            String toAuthorizeSecurityGroupsShrink = shrink(toAuthorizeSecurityGroups, "ToAuthorizeSecurityGroups", "json");
            this.putQueryParameter("ToAuthorizeSecurityGroups", toAuthorizeSecurityGroupsShrink);
            this.toAuthorizeSecurityGroups = toAuthorizeSecurityGroups;
            return this;
        }

        /**
         * The type of the service source.
         * <p>
         * 
         * *   K8s: Container Service for Kubernetes (ACK) cluster
         * *   NACOS: Nacos instance
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

    public static class IngressOptionsRequest extends TeaModel {
        @NameInMap("EnableIngress")
        private Boolean enableIngress;

        @NameInMap("EnableStatus")
        private Boolean enableStatus;

        @NameInMap("IngressClass")
        private String ingressClass;

        @NameInMap("WatchNamespace")
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
             * The group to which the service belongs.
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * The language of the response. Valid values:
             * <p>
             * 
             * *   zh-CN: Chinese. This is the default value.
             * *   en-US: English.
             * *   ja: Japanese.
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * An array of service root paths.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * The root path of the service.
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
    public static class ToAuthorizeSecurityGroups extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("SecurityGroupId")
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
             * The description of the authorization record.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The authorized port range of the security group. You can select multiple port ranges. Separate each port range with a comma (,).
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The ID of the security group.
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
