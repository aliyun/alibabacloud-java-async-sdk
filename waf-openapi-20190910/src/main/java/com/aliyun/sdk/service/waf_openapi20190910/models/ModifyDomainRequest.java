// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDomainRequest} extends {@link RequestModel}
 *
 * <p>ModifyDomainRequest</p>
 */
public class ModifyDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessHeaderMode")
    private Integer accessHeaderMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessHeaders")
    private String accessHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudNativeInstances")
    private String cloudNativeInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private Integer clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionTime")
    private Integer connectionTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Http2Port")
    private String http2Port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPort")
    private String httpPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpToUserIp")
    private Integer httpToUserIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsPort")
    private String httpsPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsRedirect")
    private Integer httpsRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpFollowStatus")
    private Integer ipFollowStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAccessProduct")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer isAccessProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keepalive")
    private Boolean keepalive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 60)
    private Integer keepaliveRequests;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 1)
    private Integer keepaliveTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancing")
    private Integer loadBalancing;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogHeaders")
    private String logHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadTime")
    private Integer readTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retry")
    private Boolean retry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SniHost")
    private String sniHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SniStatus")
    private Integer sniStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIps")
    private String sourceIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WriteTime")
    private Integer writeTime;

    private ModifyDomainRequest(Builder builder) {
        super(builder);
        this.accessHeaderMode = builder.accessHeaderMode;
        this.accessHeaders = builder.accessHeaders;
        this.accessType = builder.accessType;
        this.cloudNativeInstances = builder.cloudNativeInstances;
        this.clusterType = builder.clusterType;
        this.connectionTime = builder.connectionTime;
        this.domain = builder.domain;
        this.http2Port = builder.http2Port;
        this.httpPort = builder.httpPort;
        this.httpToUserIp = builder.httpToUserIp;
        this.httpsPort = builder.httpsPort;
        this.httpsRedirect = builder.httpsRedirect;
        this.instanceId = builder.instanceId;
        this.ipFollowStatus = builder.ipFollowStatus;
        this.isAccessProduct = builder.isAccessProduct;
        this.keepalive = builder.keepalive;
        this.keepaliveRequests = builder.keepaliveRequests;
        this.keepaliveTimeout = builder.keepaliveTimeout;
        this.loadBalancing = builder.loadBalancing;
        this.logHeaders = builder.logHeaders;
        this.readTime = builder.readTime;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.retry = builder.retry;
        this.sniHost = builder.sniHost;
        this.sniStatus = builder.sniStatus;
        this.sourceIps = builder.sourceIps;
        this.writeTime = builder.writeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessHeaderMode
     */
    public Integer getAccessHeaderMode() {
        return this.accessHeaderMode;
    }

    /**
     * @return accessHeaders
     */
    public String getAccessHeaders() {
        return this.accessHeaders;
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return cloudNativeInstances
     */
    public String getCloudNativeInstances() {
        return this.cloudNativeInstances;
    }

    /**
     * @return clusterType
     */
    public Integer getClusterType() {
        return this.clusterType;
    }

    /**
     * @return connectionTime
     */
    public Integer getConnectionTime() {
        return this.connectionTime;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return http2Port
     */
    public String getHttp2Port() {
        return this.http2Port;
    }

    /**
     * @return httpPort
     */
    public String getHttpPort() {
        return this.httpPort;
    }

    /**
     * @return httpToUserIp
     */
    public Integer getHttpToUserIp() {
        return this.httpToUserIp;
    }

    /**
     * @return httpsPort
     */
    public String getHttpsPort() {
        return this.httpsPort;
    }

    /**
     * @return httpsRedirect
     */
    public Integer getHttpsRedirect() {
        return this.httpsRedirect;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipFollowStatus
     */
    public Integer getIpFollowStatus() {
        return this.ipFollowStatus;
    }

    /**
     * @return isAccessProduct
     */
    public Integer getIsAccessProduct() {
        return this.isAccessProduct;
    }

    /**
     * @return keepalive
     */
    public Boolean getKeepalive() {
        return this.keepalive;
    }

    /**
     * @return keepaliveRequests
     */
    public Integer getKeepaliveRequests() {
        return this.keepaliveRequests;
    }

    /**
     * @return keepaliveTimeout
     */
    public Integer getKeepaliveTimeout() {
        return this.keepaliveTimeout;
    }

    /**
     * @return loadBalancing
     */
    public Integer getLoadBalancing() {
        return this.loadBalancing;
    }

    /**
     * @return logHeaders
     */
    public String getLogHeaders() {
        return this.logHeaders;
    }

    /**
     * @return readTime
     */
    public Integer getReadTime() {
        return this.readTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return retry
     */
    public Boolean getRetry() {
        return this.retry;
    }

    /**
     * @return sniHost
     */
    public String getSniHost() {
        return this.sniHost;
    }

    /**
     * @return sniStatus
     */
    public Integer getSniStatus() {
        return this.sniStatus;
    }

    /**
     * @return sourceIps
     */
    public String getSourceIps() {
        return this.sourceIps;
    }

    /**
     * @return writeTime
     */
    public Integer getWriteTime() {
        return this.writeTime;
    }

    public static final class Builder extends Request.Builder<ModifyDomainRequest, Builder> {
        private Integer accessHeaderMode; 
        private String accessHeaders; 
        private String accessType; 
        private String cloudNativeInstances; 
        private Integer clusterType; 
        private Integer connectionTime; 
        private String domain; 
        private String http2Port; 
        private String httpPort; 
        private Integer httpToUserIp; 
        private String httpsPort; 
        private Integer httpsRedirect; 
        private String instanceId; 
        private Integer ipFollowStatus; 
        private Integer isAccessProduct; 
        private Boolean keepalive; 
        private Integer keepaliveRequests; 
        private Integer keepaliveTimeout; 
        private Integer loadBalancing; 
        private String logHeaders; 
        private Integer readTime; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean retry; 
        private String sniHost; 
        private Integer sniStatus; 
        private String sourceIps; 
        private Integer writeTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDomainRequest request) {
            super(request);
            this.accessHeaderMode = request.accessHeaderMode;
            this.accessHeaders = request.accessHeaders;
            this.accessType = request.accessType;
            this.cloudNativeInstances = request.cloudNativeInstances;
            this.clusterType = request.clusterType;
            this.connectionTime = request.connectionTime;
            this.domain = request.domain;
            this.http2Port = request.http2Port;
            this.httpPort = request.httpPort;
            this.httpToUserIp = request.httpToUserIp;
            this.httpsPort = request.httpsPort;
            this.httpsRedirect = request.httpsRedirect;
            this.instanceId = request.instanceId;
            this.ipFollowStatus = request.ipFollowStatus;
            this.isAccessProduct = request.isAccessProduct;
            this.keepalive = request.keepalive;
            this.keepaliveRequests = request.keepaliveRequests;
            this.keepaliveTimeout = request.keepaliveTimeout;
            this.loadBalancing = request.loadBalancing;
            this.logHeaders = request.logHeaders;
            this.readTime = request.readTime;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.retry = request.retry;
            this.sniHost = request.sniHost;
            this.sniStatus = request.sniStatus;
            this.sourceIps = request.sourceIps;
            this.writeTime = request.writeTime;
        } 

        /**
         * The method that WAF uses to obtain the actual IP address of a client. Valid values:
         * <p>
         * 
         * *   **0**: WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client. This is the default value.
         * *   **1**: WAF reads the value of a custom header field as the actual IP address of the client.
         * 
         * >  You need to specify the parameter only when the **IsAccessProduct** parameter is set to **1**.
         */
        public Builder accessHeaderMode(Integer accessHeaderMode) {
            this.putQueryParameter("AccessHeaderMode", accessHeaderMode);
            this.accessHeaderMode = accessHeaderMode;
            return this;
        }

        /**
         * The custom header fields that are used to obtain the actual IP address of a client. Specify the value in the `["header1","header2",...]` format.
         * <p>
         * 
         * >  You need to specify the parameter only when the **AccessHeaderMode** parameter is set to **1**.
         */
        public Builder accessHeaders(String accessHeaders) {
            this.putQueryParameter("AccessHeaders", accessHeaders);
            this.accessHeaders = accessHeaders;
            return this;
        }

        /**
         * The mode that is used to add the domain name. Valid values:
         * <p>
         * 
         * *   **waf-cloud-dns**: CNAME record mode. This is the default value.
         * *   **waf-cloud-native**: transparent proxy mode.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * The list of server and port configurations for the transparent proxy mode. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
         * <p>
         * 
         * *   **ProtocolPortConfigs**: the list of protocol and port configurations. This field is required. Data type: array. Each element in a JSON array is a JSON struct that contains the following fields:
         * 
         *     *   **Ports**: the list of ports. This field is required. Data type: array. The value is in the `[port1,port2,……]` format.
         *     *   **Protocol**: the protocol. This field is required. Data type: string. Valid values: **http** and **https**.
         * 
         * *   **CloudNativeProductName**: the type of the cloud service instance. This field is required. Data type: string. Valid values: **ECS**, **SLB**, and **ALB**.
         * 
         * *   **RedirectionTypeName**: the type of traffic redirection port. This field is required. Data type: string. Valid values: **ECS**, **SLB-L4**, **SLB-L7**, and **ALB**.
         * 
         * *   **InstanceId**: the ID of the cloud service instance. This field is required. Data type: string.
         * 
         * *   **IPAddressList**: the list of public IP addresses of the cloud service instance. This field is required. Data type: array. The value is in the `["ip1","ip2",...]` format.
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-native**.
         */
        public Builder cloudNativeInstances(String cloudNativeInstances) {
            this.putQueryParameter("CloudNativeInstances", cloudNativeInstances);
            this.cloudNativeInstances = cloudNativeInstances;
            return this;
        }

        /**
         * The type of WAF protection cluster. Valid values:
         * <p>
         * 
         * *   **0**: shared cluster. This is the default value.
         * *   **1**: exclusive cluster.
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The timeout period for connections of WAF exclusive clusters. Unit: seconds.
         * <p>
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the value of the **ClusterType** parameter is set to **1**.
         */
        public Builder connectionTime(Integer connectionTime) {
            this.putQueryParameter("ConnectionTime", connectionTime);
            this.connectionTime = connectionTime;
            return this;
        }

        /**
         * The domain name whose configurations you want to modify.
         * <p>
         * 
         * >  You can call the [DescribeDomainNames](~~86373~~) operation to query the domain names that are added to Web Application Firewall (WAF).
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The HTTP/2 ports. Specify the value in the `["port1","port2",...]` format.
         * <p>
         * 
         * >  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.
         */
        public Builder http2Port(String http2Port) {
            this.putQueryParameter("Http2Port", http2Port);
            this.http2Port = http2Port;
            return this;
        }

        /**
         * The HTTP ports. Specify the value in the `["port1","port2",...]` format.
         * <p>
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**. If you specify this parameter, your website uses HTTP. You must specify at least one of the **HttpPort** and **HttpsPort** parameters.
         */
        public Builder httpPort(String httpPort) {
            this.putQueryParameter("HttpPort", httpPort);
            this.httpPort = httpPort;
            return this;
        }

        /**
         * Specifies whether to enable the feature of redirecting HTTPS requests to HTTP requests. If you enable the feature, HTTPS requests are redirected to HTTP requests on port 80, which is used by default. Valid values:
         * <p>
         * 
         * *   **0**: disables the feature. This is the default value.
         * *   **1**: enables the feature.
         * 
         * >  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.
         */
        public Builder httpToUserIp(Integer httpToUserIp) {
            this.putQueryParameter("HttpToUserIp", httpToUserIp);
            this.httpToUserIp = httpToUserIp;
            return this;
        }

        /**
         * The HTTPS ports. Specify the value in the `["port1","port2",...]` format.
         * <p>
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**. If you specify this parameter, your website uses HTTPS. You must specify at least one of the **HttpPort** and **HttpsPort** parameters.
         */
        public Builder httpsPort(String httpsPort) {
            this.putQueryParameter("HttpsPort", httpsPort);
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * Specifies whether to enable the feature of redirecting HTTP requests to HTTPS requests. If you enable the feature, HTTP requests are redirected to HTTPS requests on port 443, which is used by default. Valid values:
         * <p>
         * 
         * *   **0**: disables the feature. This is the default value.
         * *   **1**: enables the feature.
         * 
         * >  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.
         */
        public Builder httpsRedirect(Integer httpsRedirect) {
            this.putQueryParameter("HttpsRedirect", httpsRedirect);
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstanceInfo](~~140857~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to enable the feature of forwarding requests to the origin servers that use the IP address type specified in the requests. If you enable the feature, WAF forwards requests from IPv4 addresses to origin servers that use IPv4 addresses and requests from IPv6 addresses to origin servers that use IPv6 addresses. Valid values:
         * <p>
         * 
         * *   **0**: disables the feature. This is the default value.
         * *   **1**: enables the feature.
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.
         */
        public Builder ipFollowStatus(Integer ipFollowStatus) {
            this.putQueryParameter("IpFollowStatus", ipFollowStatus);
            this.ipFollowStatus = ipFollowStatus;
            return this;
        }

        /**
         * Specifies whether to deploy a Layer 7 proxy, which is used to filter inbound traffic before the traffic reaches the WAF instance. The supported Layer 7 proxies include Anti-DDoS Pro, Anti-DDoS Premium, and Alibaba Cloud CDN. Valid values:
         * <p>
         * 
         * *   **0**: does not configure a Layer 7 proxy
         * *   **1**: configures a Layer 7 proxy
         */
        public Builder isAccessProduct(Integer isAccessProduct) {
            this.putQueryParameter("IsAccessProduct", isAccessProduct);
            this.isAccessProduct = isAccessProduct;
            return this;
        }

        /**
         * Keepalive.
         */
        public Builder keepalive(Boolean keepalive) {
            this.putQueryParameter("Keepalive", keepalive);
            this.keepalive = keepalive;
            return this;
        }

        /**
         * KeepaliveRequests.
         */
        public Builder keepaliveRequests(Integer keepaliveRequests) {
            this.putQueryParameter("KeepaliveRequests", keepaliveRequests);
            this.keepaliveRequests = keepaliveRequests;
            return this;
        }

        /**
         * KeepaliveTimeout.
         */
        public Builder keepaliveTimeout(Integer keepaliveTimeout) {
            this.putQueryParameter("KeepaliveTimeout", keepaliveTimeout);
            this.keepaliveTimeout = keepaliveTimeout;
            return this;
        }

        /**
         * The load balancing algorithm that is used when WAF forwards requests to the origin server. Valid values:
         * <p>
         * 
         * *   **0**: IP hash
         * *   **1**: round-robin
         * *   **2**: least time
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.
         */
        public Builder loadBalancing(Integer loadBalancing) {
            this.putQueryParameter("LoadBalancing", loadBalancing);
            this.loadBalancing = loadBalancing;
            return this;
        }

        /**
         * The key-value pair that is used to mark the requests that pass through the WAF instance.
         * <p>
         * 
         * Specify the key-value pair in the `[{"k":"_key_","v":"_value_"}]` format. `_key_` specifies a header field in a custom request. `_value_` specifies the value of the field.
         * 
         * WAF automatically adds the key-value pair to the headers of requests. This way, the requests that pass through WAF are identified.
         * 
         * >  If requests contain the custom header field, WAF overwrites the original value of the field with the specified value.
         */
        public Builder logHeaders(String logHeaders) {
            this.putQueryParameter("LogHeaders", logHeaders);
            this.logHeaders = logHeaders;
            return this;
        }

        /**
         * The timeout period for read connections of WAF exclusive clusters. Unit: seconds.
         * <p>
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the value of the **ClusterType** parameter is set to **1**.
         */
        public Builder readTime(Integer readTime) {
            this.putQueryParameter("ReadTime", readTime);
            this.readTime = readTime;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Retry.
         */
        public Builder retry(Boolean retry) {
            this.putQueryParameter("Retry", retry);
            this.retry = retry;
            return this;
        }

        /**
         * The value of the custom SNI field. If this parameter is not specified, the value of the **Host** field in the request header is automatically used as the value of the SNI field.
         * <p>
         * 
         * If you want WAF to use an SNI field whose value is different from the value of the Host field, you can specify a custom value for the SNI field.
         * 
         * >  This parameter needs to be set only when the value of the **SniStatus** parameter is set to **1**.
         */
        public Builder sniHost(String sniHost) {
            this.putQueryParameter("SniHost", sniHost);
            this.sniHost = sniHost;
            return this;
        }

        /**
         * Specifies whether to enable origin SNI. Origin Server Name Indication (SNI) specifies the domain name to which an HTTPS connection needs to be established at the start of the TLS handshaking process when WAF forwards requests to the origin server. If the origin server hosts multiple domain names, you must enable this feature. Valid values:
         * <p>
         * 
         * *   **0**: disables origin SNI.
         * *   **1**: enables origin SNI.
         * 
         * By default, origin SNI is disabled for WAF instances in the Chinese mainland and enabled for WAF instances outside the Chinese mainland.
         * 
         * >  You need to specify this parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the **HttpsPort** parameter is not empty. If the HttpsPort parameter is not empty, your website uses HTTPS.
         */
        public Builder sniStatus(Integer sniStatus) {
            this.putQueryParameter("SniStatus", sniStatus);
            this.sniStatus = sniStatus;
            return this;
        }

        /**
         * The address type of the origin server. The address can be an IP address or a domain name. You can specify only one type of address.
         * <p>
         * 
         * *   If you use the IP address type, specify the value in the `["ip1","ip2",...]` format. You can add up to 20 IP addresses.
         * *   If you use the domain name type, specify the value in the `["domain"]` format. You can enter only one domain name.
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns**.
         */
        public Builder sourceIps(String sourceIps) {
            this.putQueryParameter("SourceIps", sourceIps);
            this.sourceIps = sourceIps;
            return this;
        }

        /**
         * The timeout period for write connections of WAF exclusive clusters. Unit: seconds.
         * <p>
         * 
         * >  You need to specify the parameter only when the value of the **AccessType** parameter is set to **waf-cloud-dns** and the value of the **ClusterType** parameter is set to **1**.
         */
        public Builder writeTime(Integer writeTime) {
            this.putQueryParameter("WriteTime", writeTime);
            this.writeTime = writeTime;
            return this;
        }

        @Override
        public ModifyDomainRequest build() {
            return new ModifyDomainRequest(this);
        } 

    } 

}
