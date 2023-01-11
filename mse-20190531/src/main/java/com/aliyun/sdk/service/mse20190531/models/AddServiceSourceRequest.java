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
            this.type = request.type;
        } 

        /**
         * The language in which the returned information is displayed. Valid values:
         * <p>
         * 
         * *   zh-CN: Chinese. This is the default value.
         * *   en-US: English.
         * *   ja: Japanese.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The endpoint.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The list of service groups.
         */
        public Builder groupList(java.util.List < String > groupList) {
            String groupListShrink = shrink(groupList, "GroupList", "json");
            this.putQueryParameter("GroupList", groupListShrink);
            this.groupList = groupList;
            return this;
        }

        /**
         * The Ingress configuration.
         */
        public Builder ingressOptionsRequest(IngressOptionsRequest ingressOptionsRequest) {
            String ingressOptionsRequestShrink = shrink(ingressOptionsRequest, "IngressOptionsRequest", "json");
            this.putQueryParameter("IngressOptionsRequest", ingressOptionsRequestShrink);
            this.ingressOptionsRequest = ingressOptionsRequest;
            return this;
        }

        /**
         * The name.
         * <p>
         * 
         * > The parameter value varies based on the source type.
         * 
         * *   If Type is set to K8S, this parameter specifies the name of the ACK cluster.
         * *   If Type is set to NACOS, this parameter specifies the ID of the instance.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * An array of service root paths.
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
         * *   K8S: ACK cluster
         * *   MSE: Nacos instance
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The type of the service source. Valid values:
         * <p>
         * 
         * *   K8S: ACK cluster
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
             * Specifies whether to enable Ingress.
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * Specifies whether to update the Ingress status.
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * Specifies whether to monitor Ingress classes.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * The namespace whose resources you want to monitor.
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
}
