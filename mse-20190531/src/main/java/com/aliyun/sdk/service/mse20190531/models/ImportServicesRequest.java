// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportServicesRequest} extends {@link RequestModel}
 *
 * <p>ImportServicesRequest</p>
 */
public class ImportServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FcAlias")
    private String fcAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FcServiceName")
    private String fcServiceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FcVersion")
    private String fcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceList")
    private java.util.List < ServiceList> serviceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsSetting")
    private String tlsSetting;

    private ImportServicesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.fcAlias = builder.fcAlias;
        this.fcServiceName = builder.fcServiceName;
        this.fcVersion = builder.fcVersion;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.serviceList = builder.serviceList;
        this.sourceType = builder.sourceType;
        this.tlsSetting = builder.tlsSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportServicesRequest create() {
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
     * @return fcAlias
     */
    public String getFcAlias() {
        return this.fcAlias;
    }

    /**
     * @return fcServiceName
     */
    public String getFcServiceName() {
        return this.fcServiceName;
    }

    /**
     * @return fcVersion
     */
    public String getFcVersion() {
        return this.fcVersion;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return serviceList
     */
    public java.util.List < ServiceList> getServiceList() {
        return this.serviceList;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return tlsSetting
     */
    public String getTlsSetting() {
        return this.tlsSetting;
    }

    public static final class Builder extends Request.Builder<ImportServicesRequest, Builder> {
        private String acceptLanguage; 
        private String fcAlias; 
        private String fcServiceName; 
        private String fcVersion; 
        private String gatewayUniqueId; 
        private java.util.List < ServiceList> serviceList; 
        private String sourceType; 
        private String tlsSetting; 

        private Builder() {
            super();
        } 

        private Builder(ImportServicesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.fcAlias = request.fcAlias;
            this.fcServiceName = request.fcServiceName;
            this.fcVersion = request.fcVersion;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.serviceList = request.serviceList;
            this.sourceType = request.sourceType;
            this.tlsSetting = request.tlsSetting;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * FcAlias.
         */
        public Builder fcAlias(String fcAlias) {
            this.putQueryParameter("FcAlias", fcAlias);
            this.fcAlias = fcAlias;
            return this;
        }

        /**
         * FcServiceName.
         */
        public Builder fcServiceName(String fcServiceName) {
            this.putQueryParameter("FcServiceName", fcServiceName);
            this.fcServiceName = fcServiceName;
            return this;
        }

        /**
         * FcVersion.
         */
        public Builder fcVersion(String fcVersion) {
            this.putQueryParameter("FcVersion", fcVersion);
            this.fcVersion = fcVersion;
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
         * The information about services.
         */
        public Builder serviceList(java.util.List < ServiceList> serviceList) {
            String serviceListShrink = shrink(serviceList, "ServiceList", "json");
            this.putQueryParameter("ServiceList", serviceListShrink);
            this.serviceList = serviceList;
            return this;
        }

        /**
         * The service source. Valid values:
         * <p>
         * 
         * *   MSE: MSE Nacos instance
         * *   K8s: ACK cluster
         * *   VIP: fixed address
         * *   DNS: DNS domain
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The Transport Layer Security (TLS) settings. Valid values:
         * <p>
         * 
         * *   mode: TLS mode
         * *   certId: certificate ID
         * *   caCertId: CA certificate ID
         * *   caCertContent: CA certificate public key
         * *   sni: service name identification
         */
        public Builder tlsSetting(String tlsSetting) {
            this.putQueryParameter("TlsSetting", tlsSetting);
            this.tlsSetting = tlsSetting;
            return this;
        }

        @Override
        public ImportServicesRequest build() {
            return new ImportServicesRequest(this);
        } 

    } 

    public static class ServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List < String > ips;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Long servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        private ServiceList(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.servicePort = builder.servicePort;
            this.serviceProtocol = builder.serviceProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceList create() {
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

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return servicePort
         */
        public Long getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 
            private String name; 
            private String namespace; 
            private Long servicePort; 
            private String serviceProtocol; 

            /**
             * The group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The IP addresses of the service.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The port of the service.
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The protocol of the service.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            public ServiceList build() {
                return new ServiceList(this);
            } 

        } 

    }
}
