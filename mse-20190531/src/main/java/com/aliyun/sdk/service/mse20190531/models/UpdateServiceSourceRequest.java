// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceSourceRequest</p>
 */
public class UpdateServiceSourceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Id")
    private Long id;

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

    private UpdateServiceSourceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.address = builder.address;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.ingressOptionsRequest = builder.ingressOptionsRequest;
        this.name = builder.name;
        this.pathList = builder.pathList;
        this.source = builder.source;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceSourceRequest create() {
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
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateServiceSourceRequest, Builder> {
        private String acceptLanguage; 
        private String address; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 
        private IngressOptionsRequest ingressOptionsRequest; 
        private String name; 
        private java.util.List < String > pathList; 
        private String source; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceSourceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.address = request.address;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.ingressOptionsRequest = request.ingressOptionsRequest;
            this.name = request.name;
            this.pathList = request.pathList;
            this.source = request.source;
            this.type = request.type;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IngressOptionsRequest.
         */
        public Builder ingressOptionsRequest(IngressOptionsRequest ingressOptionsRequest) {
            String ingressOptionsRequestShrink = shrink(ingressOptionsRequest, "IngressOptionsRequest", "json");
            this.putQueryParameter("IngressOptionsRequest", ingressOptionsRequestShrink);
            this.ingressOptionsRequest = ingressOptionsRequest;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PathList.
         */
        public Builder pathList(java.util.List < String > pathList) {
            String pathListShrink = shrink(pathList, "PathList", "json");
            this.putQueryParameter("PathList", pathListShrink);
            this.pathList = pathList;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateServiceSourceRequest build() {
            return new UpdateServiceSourceRequest(this);
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
             * EnableIngress.
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * EnableStatus.
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * IngressClass.
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * WatchNamespace.
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
