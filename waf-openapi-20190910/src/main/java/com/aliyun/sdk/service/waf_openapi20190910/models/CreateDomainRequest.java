// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
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

    private CreateDomainRequest(Builder builder) {
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

    public static CreateDomainRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
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

        private Builder(CreateDomainRequest request) {
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
         * AccessHeaderMode.
         */
        public Builder accessHeaderMode(Integer accessHeaderMode) {
            this.putQueryParameter("AccessHeaderMode", accessHeaderMode);
            this.accessHeaderMode = accessHeaderMode;
            return this;
        }

        /**
         * AccessHeaders.
         */
        public Builder accessHeaders(String accessHeaders) {
            this.putQueryParameter("AccessHeaders", accessHeaders);
            this.accessHeaders = accessHeaders;
            return this;
        }

        /**
         * AccessType.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * CloudNativeInstances.
         */
        public Builder cloudNativeInstances(String cloudNativeInstances) {
            this.putQueryParameter("CloudNativeInstances", cloudNativeInstances);
            this.cloudNativeInstances = cloudNativeInstances;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * ConnectionTime.
         */
        public Builder connectionTime(Integer connectionTime) {
            this.putQueryParameter("ConnectionTime", connectionTime);
            this.connectionTime = connectionTime;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Http2Port.
         */
        public Builder http2Port(String http2Port) {
            this.putQueryParameter("Http2Port", http2Port);
            this.http2Port = http2Port;
            return this;
        }

        /**
         * HttpPort.
         */
        public Builder httpPort(String httpPort) {
            this.putQueryParameter("HttpPort", httpPort);
            this.httpPort = httpPort;
            return this;
        }

        /**
         * HttpToUserIp.
         */
        public Builder httpToUserIp(Integer httpToUserIp) {
            this.putQueryParameter("HttpToUserIp", httpToUserIp);
            this.httpToUserIp = httpToUserIp;
            return this;
        }

        /**
         * HttpsPort.
         */
        public Builder httpsPort(String httpsPort) {
            this.putQueryParameter("HttpsPort", httpsPort);
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * HttpsRedirect.
         */
        public Builder httpsRedirect(Integer httpsRedirect) {
            this.putQueryParameter("HttpsRedirect", httpsRedirect);
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IpFollowStatus.
         */
        public Builder ipFollowStatus(Integer ipFollowStatus) {
            this.putQueryParameter("IpFollowStatus", ipFollowStatus);
            this.ipFollowStatus = ipFollowStatus;
            return this;
        }

        /**
         * IsAccessProduct.
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
         * LoadBalancing.
         */
        public Builder loadBalancing(Integer loadBalancing) {
            this.putQueryParameter("LoadBalancing", loadBalancing);
            this.loadBalancing = loadBalancing;
            return this;
        }

        /**
         * LogHeaders.
         */
        public Builder logHeaders(String logHeaders) {
            this.putQueryParameter("LogHeaders", logHeaders);
            this.logHeaders = logHeaders;
            return this;
        }

        /**
         * ReadTime.
         */
        public Builder readTime(Integer readTime) {
            this.putQueryParameter("ReadTime", readTime);
            this.readTime = readTime;
            return this;
        }

        /**
         * RegionId.
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
         * SniHost.
         */
        public Builder sniHost(String sniHost) {
            this.putQueryParameter("SniHost", sniHost);
            this.sniHost = sniHost;
            return this;
        }

        /**
         * SniStatus.
         */
        public Builder sniStatus(Integer sniStatus) {
            this.putQueryParameter("SniStatus", sniStatus);
            this.sniStatus = sniStatus;
            return this;
        }

        /**
         * SourceIps.
         */
        public Builder sourceIps(String sourceIps) {
            this.putQueryParameter("SourceIps", sourceIps);
            this.sourceIps = sourceIps;
            return this;
        }

        /**
         * WriteTime.
         */
        public Builder writeTime(Integer writeTime) {
            this.putQueryParameter("WriteTime", writeTime);
            this.writeTime = writeTime;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

}
