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
 * {@link UpdateGatewayServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceRequest</p>
 */
public class UpdateGatewayServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsServerList")
    private java.util.List<String> dnsServerList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List<String> ipList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePort")
    private String servicePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
    private String serviceProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsSetting")
    private String tlsSetting;

    private UpdateGatewayServiceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.dnsServerList = builder.dnsServerList;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.ipList = builder.ipList;
        this.name = builder.name;
        this.servicePort = builder.servicePort;
        this.serviceProtocol = builder.serviceProtocol;
        this.tlsSetting = builder.tlsSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayServiceRequest create() {
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
     * @return dnsServerList
     */
    public java.util.List<String> getDnsServerList() {
        return this.dnsServerList;
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
    public String getId() {
        return this.id;
    }

    /**
     * @return ipList
     */
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return servicePort
     */
    public String getServicePort() {
        return this.servicePort;
    }

    /**
     * @return serviceProtocol
     */
    public String getServiceProtocol() {
        return this.serviceProtocol;
    }

    /**
     * @return tlsSetting
     */
    public String getTlsSetting() {
        return this.tlsSetting;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayServiceRequest, Builder> {
        private String acceptLanguage; 
        private java.util.List<String> dnsServerList; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private String id; 
        private java.util.List<String> ipList; 
        private String name; 
        private String servicePort; 
        private String serviceProtocol; 
        private String tlsSetting; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayServiceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.dnsServerList = request.dnsServerList;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.ipList = request.ipList;
            this.name = request.name;
            this.servicePort = request.servicePort;
            this.serviceProtocol = request.serviceProtocol;
            this.tlsSetting = request.tlsSetting;
        } 

        /**
         * <p>The language in which you want the results to be displayed. Valid values: zh (default): Chinese. en: English.</p>
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
         * <p>The list of Domain Name System (DNS) servers (for DNS domain name services only).</p>
         */
        public Builder dnsServerList(java.util.List<String> dnsServerList) {
            String dnsServerListShrink = shrink(dnsServerList, "DnsServerList", "json");
            this.putQueryParameter("DnsServerList", dnsServerListShrink);
            this.dnsServerList = dnsServerList;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>501</p>
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
         * <p>gw-c9bc5afd61014165bd58f621b491*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>322</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The address list of fixed address services or domain name list of Domain Name System (DNS) services.</p>
         */
        public Builder ipList(java.util.List<String> ipList) {
            String ipListShrink = shrink(ipList, "IpList", "json");
            this.putQueryParameter("IpList", ipListShrink);
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The service name. This parameter is deprecated and cannot be modified. The value of this parameter must be the same as the current service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The service port. Specify this parameter for DNS services.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder servicePort(String servicePort) {
            this.putQueryParameter("ServicePort", servicePort);
            this.servicePort = servicePort;
            return this;
        }

        /**
         * <p>The service protocol.</p>
         * <ul>
         * <li><p>HTTP</p>
         * </li>
         * <li><p>HTTPS</p>
         * </li>
         * <li><p>HTTP2</p>
         * </li>
         * <li><p>GRPC</p>
         * </li>
         * <li><p>DUBBO</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder serviceProtocol(String serviceProtocol) {
            this.putQueryParameter("ServiceProtocol", serviceProtocol);
            this.serviceProtocol = serviceProtocol;
            return this;
        }

        /**
         * <p>The Transport Layer Security (TLS) settings. Valid values:</p>
         * <ul>
         * <li><p>mode: TLS mode</p>
         * </li>
         * <li><p>certId: certificate ID</p>
         * </li>
         * <li><p>caCertId: CA certificate ID</p>
         * </li>
         * <li><p>caCertContent: CA certificate public key</p>
         * </li>
         * <li><p>sni: service name identification</p>
         * </li>
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
        public UpdateGatewayServiceRequest build() {
            return new UpdateGatewayServiceRequest(this);
        } 

    } 

}
