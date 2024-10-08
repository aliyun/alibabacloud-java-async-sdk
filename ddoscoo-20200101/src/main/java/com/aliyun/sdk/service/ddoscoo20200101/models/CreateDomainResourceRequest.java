// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainResourceRequest</p>
 */
public class CreateDomainResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsExt")
    private String httpsExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ProxyTypes> proxyTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > realServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rsType;

    private CreateDomainResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return httpsExt
     */
    public String getHttpsExt() {
        return this.httpsExt;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return proxyTypes
     */
    public java.util.List < ProxyTypes> getProxyTypes() {
        return this.proxyTypes;
    }

    /**
     * @return realServers
     */
    public java.util.List < String > getRealServers() {
        return this.realServers;
    }

    /**
     * @return rsType
     */
    public Integer getRsType() {
        return this.rsType;
    }

    public static final class Builder extends Request.Builder<CreateDomainResourceRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String httpsExt; 
        private java.util.List < String > instanceIds; 
        private java.util.List < ProxyTypes> proxyTypes; 
        private java.util.List < String > realServers; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.httpsExt = request.httpsExt;
            this.instanceIds = request.instanceIds;
            this.proxyTypes = request.proxyTypes;
            this.realServers = request.realServers;
            this.rsType = request.rsType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The domain name of the website that you want to add to the Anti-DDoS Pro or Anti-DDoS Premium instance.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The advanced HTTPS settings. This parameter takes effect only when the value of the **ProxyType** parameter includes **https**. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:
         * <p>
         * 
         * *   **Http2https**: specifies whether to turn on Enforce HTTPS Routing. This field is optional and must be an integer. Valid values: **0** and **1**. The value 0 indicates that Enforce HTTPS Routing is turned off. The value 1 indicates that Enforce HTTPS Routing is turned on. The default value is 0.
         * 
         *     If your website supports both HTTP and HTTPS, this feature meets your business requirements. If you enable this feature, all HTTP requests to access the website are redirected to HTTPS requests on the standard port 443.
         * 
         * *   **Https2http**: specifies whether to turn on Enable HTTP. This field is optional and must be an integer. Valid values: **0** and **1**. The value 0 indicates that Enable HTTP is turned off. The value 1 indicates that Enable HTTP is turned on. The default value is 0.
         * 
         *     If your website does not support HTTPS, this feature meets your business requirements If this feature is enabled, all HTTPS requests are redirected to HTTP requests and forwarded to origin servers. This feature can redirect WebSockets requests to WebSocket requests. Requests are redirected over the standard port 80.
         * 
         * *   **Http2**: specifies whether to turn on Enable HTTP/2. This field is optional. Data type: integer. Valid values: **0** and **1**. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.
         * 
         *     After you turn on the switch, HTTP/2 is used.
         */
        public Builder httpsExt(String httpsExt) {
            this.putQueryParameter("HttpsExt", httpsExt);
            this.httpsExt = httpsExt;
            return this;
        }

        /**
         * An array consisting of the IDs of instances that you want to associate.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The details about the protocol type and port number.
         */
        public Builder proxyTypes(java.util.List < ProxyTypes> proxyTypes) {
            this.putQueryParameter("ProxyTypes", proxyTypes);
            this.proxyTypes = proxyTypes;
            return this;
        }

        /**
         * An array that consists of the addresses of origin servers.
         */
        public Builder realServers(java.util.List < String > realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        /**
         * The address type of the origin server. Valid values:
         * <p>
         * 
         * *   **0**: IP address.
         * 
         * *   **1**: domain name.
         * 
         *     This parameter is suitable for scenarios in which another proxy service, such as Web Application Firewall (WAF), is deployed between the origin server and Anti-DDoS Proxy. The address is the redirection address of the proxy service, such as the CNAME of WAF.
         */
        public Builder rsType(Integer rsType) {
            this.putQueryParameter("RsType", rsType);
            this.rsType = rsType;
            return this;
        }

        @Override
        public CreateDomainResourceRequest build() {
            return new CreateDomainResourceRequest(this);
        } 

    } 

    public static class ProxyTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProxyPorts")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Integer > proxyPorts;

        @com.aliyun.core.annotation.NameInMap("ProxyType")
        private String proxyType;

        private ProxyTypes(Builder builder) {
            this.proxyPorts = builder.proxyPorts;
            this.proxyType = builder.proxyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyTypes create() {
            return builder().build();
        }

        /**
         * @return proxyPorts
         */
        public java.util.List < Integer > getProxyPorts() {
            return this.proxyPorts;
        }

        /**
         * @return proxyType
         */
        public String getProxyType() {
            return this.proxyType;
        }

        public static final class Builder {
            private java.util.List < Integer > proxyPorts; 
            private String proxyType; 

            /**
             * The port numbers.
             */
            public Builder proxyPorts(java.util.List < Integer > proxyPorts) {
                this.proxyPorts = proxyPorts;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **http**
             * *   **https**
             * *   **websocket**
             * *   **websockets**
             */
            public Builder proxyType(String proxyType) {
                this.proxyType = proxyType;
                return this;
            }

            public ProxyTypes build() {
                return new ProxyTypes(this);
            } 

        } 

    }
}
