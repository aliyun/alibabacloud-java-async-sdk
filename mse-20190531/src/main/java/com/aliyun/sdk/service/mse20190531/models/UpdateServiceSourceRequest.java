// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServiceSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceSourceRequest</p>
 */
public class UpdateServiceSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

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
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The address.</p>
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
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>429</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cdd1bb9bfb8341e9805f931a3ba1f4c6</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the service source.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The configurations of Ingress resources.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder ingressOptionsRequest(IngressOptionsRequest ingressOptionsRequest) {
            String ingressOptionsRequestShrink = shrink(ingressOptionsRequest, "IngressOptionsRequest", "json");
            this.putQueryParameter("IngressOptionsRequest", ingressOptionsRequestShrink);
            this.ingressOptionsRequest = ingressOptionsRequest;
            return this;
        }

        /**
         * <p>The name.</p>
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
         * <p>An array of service root paths.</p>
         */
        public Builder pathList(java.util.List < String > pathList) {
            String pathListShrink = shrink(pathList, "PathList", "json");
            this.putQueryParameter("PathList", pathListShrink);
            this.pathList = pathList;
            return this;
        }

        /**
         * <p>The service source. Valid values:</p>
         * <ul>
         * <li>K8s: ACK cluster.</li>
         * <li>MSE: Nacos instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>K8s</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The type of the service source. Valid values:</p>
         * <ul>
         * <li>K8s: ACK cluster.</li>
         * <li>NACOS: Nacos instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>K8s</p>
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

    /**
     * 
     * {@link UpdateServiceSourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceSourceRequest</p>
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
             * <p>Specifies whether to enable Ingress.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIngress(Boolean enableIngress) {
                this.enableIngress = enableIngress;
                return this;
            }

            /**
             * <p>Specifies whether to update the Ingress status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableStatus(Boolean enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>Specifies whether to monitor Ingress classes.</p>
             * 
             * <strong>example:</strong>
             * <p>com.test.xxx</p>
             */
            public Builder ingressClass(String ingressClass) {
                this.ingressClass = ingressClass;
                return this;
            }

            /**
             * <p>The namespace whose resources you want to monitor.</p>
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
}
