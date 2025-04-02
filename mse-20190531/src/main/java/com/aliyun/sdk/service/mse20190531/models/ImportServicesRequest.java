// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.List<ServiceList> serviceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private Long sourceId;

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
        this.sourceId = builder.sourceId;
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
    public java.util.List<ServiceList> getServiceList() {
        return this.serviceList;
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
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
        private java.util.List<ServiceList> serviceList; 
        private Long sourceId; 
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
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.tlsSetting = request.tlsSetting;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
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
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-77e1153db6e14c0a8b1fae20bcb89ca5</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The information about services.</p>
         * 
         * <strong>example:</strong>
         * <p>DNS</p>
         */
        public Builder serviceList(java.util.List<ServiceList> serviceList) {
            String serviceListShrink = shrink(serviceList, "ServiceList", "json");
            this.putQueryParameter("ServiceList", serviceListShrink);
            this.serviceList = serviceList;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(Long sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The service source. Valid values:</p>
         * <ul>
         * <li>MSE: MSE Nacos instance</li>
         * <li>K8s: ACK cluster</li>
         * <li>VIP: fixed address</li>
         * <li>DNS: DNS domain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DNS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The Transport Layer Security (TLS) settings. Valid values:</p>
         * <ul>
         * <li>mode: TLS mode</li>
         * <li>certId: certificate ID</li>
         * <li>caCertId: CA certificate ID</li>
         * <li>caCertContent: CA certificate public key</li>
         * <li>sni: service name identification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;mode&quot;: &quot;MUTUAL&quot;,
         *       &quot;certId&quot;: &quot;1*****-cn-hangzhou&quot;,
         *       &quot;caCertContent&quot;: &quot;123&quot;,
         *       &quot;sni&quot;: &quot;ceshi&quot;
         * }</p>
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

    /**
     * 
     * {@link ImportServicesRequest} extends {@link TeaModel}
     *
     * <p>ImportServicesRequest</p>
     */
    public static class ServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServerList")
        private java.util.List<String> dnsServerList;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Long servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        private ServiceList(Builder builder) {
            this.dnsServerList = builder.dnsServerList;
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
         * @return dnsServerList
         */
        public java.util.List<String> getDnsServerList() {
            return this.dnsServerList;
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
        public java.util.List<String> getIps() {
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
            private java.util.List<String> dnsServerList; 
            private String groupName; 
            private java.util.List<String> ips; 
            private String name; 
            private String namespace; 
            private Long servicePort; 
            private String serviceProtocol; 

            private Builder() {
            } 

            private Builder(ServiceList model) {
                this.dnsServerList = model.dnsServerList;
                this.groupName = model.groupName;
                this.ips = model.ips;
                this.name = model.name;
                this.namespace = model.namespace;
                this.servicePort = model.servicePort;
                this.serviceProtocol = model.serviceProtocol;
            } 

            /**
             * DnsServerList.
             */
            public Builder dnsServerList(java.util.List<String> dnsServerList) {
                this.dnsServerList = dnsServerList;
                return this;
            }

            /**
             * <p>The group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The IP addresses of the service.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The port of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The protocol of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>GRPC, HTTP</p>
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
