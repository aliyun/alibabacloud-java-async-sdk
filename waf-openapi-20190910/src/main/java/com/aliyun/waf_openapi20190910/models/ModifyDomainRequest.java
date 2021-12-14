// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyDomainRequest} extends {@link RequestModel}
 *
 * <p>ModifyDomainRequest</p>
 */
public class ModifyDomainRequest extends Request {
    @Query
    @NameInMap("AccessHeaderMode")
    private Integer accessHeaderMode;

    @Query
    @NameInMap("AccessHeaders")
    private String accessHeaders;

    @Query
    @NameInMap("AccessType")
    private String accessType;

    @Query
    @NameInMap("CloudNativeInstances")
    private String cloudNativeInstances;

    @Query
    @NameInMap("ClusterType")
    private Integer clusterType;

    @Query
    @NameInMap("ConnectionTime")
    private Integer connectionTime;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Http2Port")
    private String http2Port;

    @Query
    @NameInMap("HttpPort")
    private String httpPort;

    @Query
    @NameInMap("HttpToUserIp")
    private Integer httpToUserIp;

    @Query
    @NameInMap("HttpsPort")
    private String httpsPort;

    @Query
    @NameInMap("HttpsRedirect")
    private Integer httpsRedirect;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("IpFollowStatus")
    private Integer ipFollowStatus;

    @Query
    @NameInMap("IsAccessProduct")
    private Integer isAccessProduct;

    @Query
    @NameInMap("LoadBalancing")
    private Integer loadBalancing;

    @Query
    @NameInMap("LogHeaders")
    private String logHeaders;

    @Query
    @NameInMap("ReadTime")
    private Integer readTime;

    @Query
    @NameInMap("SniHost")
    private String sniHost;

    @Query
    @NameInMap("SniStatus")
    private Integer sniStatus;

    @Query
    @NameInMap("SourceIps")
    private String sourceIps;

    @Query
    @NameInMap("WriteTime")
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
        this.loadBalancing = builder.loadBalancing;
        this.logHeaders = builder.logHeaders;
        this.readTime = builder.readTime;
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

    public static final class Builder extends Request.Builder {
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
        private Integer loadBalancing; 
        private String logHeaders; 
        private Integer readTime; 
        private String sniHost; 
        private Integer sniStatus; 
        private String sourceIps; 
        private Integer writeTime; 

        /**
         * <p>AccessHeaderMode.</p>
         */
        public Builder accessHeaderMode(Integer accessHeaderMode) {
            this.putQueryParameter("AccessHeaderMode", accessHeaderMode);
            this.accessHeaderMode = accessHeaderMode;
            return this;
        }

        /**
         * <p>AccessHeaders.</p>
         */
        public Builder accessHeaders(String accessHeaders) {
            this.putQueryParameter("AccessHeaders", accessHeaders);
            this.accessHeaders = accessHeaders;
            return this;
        }

        /**
         * <p>AccessType.</p>
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>CloudNativeInstances.</p>
         */
        public Builder cloudNativeInstances(String cloudNativeInstances) {
            this.putQueryParameter("CloudNativeInstances", cloudNativeInstances);
            this.cloudNativeInstances = cloudNativeInstances;
            return this;
        }

        /**
         * <p>ClusterType.</p>
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>ConnectionTime.</p>
         */
        public Builder connectionTime(Integer connectionTime) {
            this.putQueryParameter("ConnectionTime", connectionTime);
            this.connectionTime = connectionTime;
            return this;
        }

        /**
         * <p>Domain.</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Http2Port.</p>
         */
        public Builder http2Port(String http2Port) {
            this.putQueryParameter("Http2Port", http2Port);
            this.http2Port = http2Port;
            return this;
        }

        /**
         * <p>HttpPort.</p>
         */
        public Builder httpPort(String httpPort) {
            this.putQueryParameter("HttpPort", httpPort);
            this.httpPort = httpPort;
            return this;
        }

        /**
         * <p>HttpToUserIp.</p>
         */
        public Builder httpToUserIp(Integer httpToUserIp) {
            this.putQueryParameter("HttpToUserIp", httpToUserIp);
            this.httpToUserIp = httpToUserIp;
            return this;
        }

        /**
         * <p>HttpsPort.</p>
         */
        public Builder httpsPort(String httpsPort) {
            this.putQueryParameter("HttpsPort", httpsPort);
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * <p>HttpsRedirect.</p>
         */
        public Builder httpsRedirect(Integer httpsRedirect) {
            this.putQueryParameter("HttpsRedirect", httpsRedirect);
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>IpFollowStatus.</p>
         */
        public Builder ipFollowStatus(Integer ipFollowStatus) {
            this.putQueryParameter("IpFollowStatus", ipFollowStatus);
            this.ipFollowStatus = ipFollowStatus;
            return this;
        }

        /**
         * <p>IsAccessProduct.</p>
         */
        public Builder isAccessProduct(Integer isAccessProduct) {
            this.putQueryParameter("IsAccessProduct", isAccessProduct);
            this.isAccessProduct = isAccessProduct;
            return this;
        }

        /**
         * <p>LoadBalancing.</p>
         */
        public Builder loadBalancing(Integer loadBalancing) {
            this.putQueryParameter("LoadBalancing", loadBalancing);
            this.loadBalancing = loadBalancing;
            return this;
        }

        /**
         * <p>LogHeaders.</p>
         */
        public Builder logHeaders(String logHeaders) {
            this.putQueryParameter("LogHeaders", logHeaders);
            this.logHeaders = logHeaders;
            return this;
        }

        /**
         * <p>ReadTime.</p>
         */
        public Builder readTime(Integer readTime) {
            this.putQueryParameter("ReadTime", readTime);
            this.readTime = readTime;
            return this;
        }

        /**
         * <p>SniHost.</p>
         */
        public Builder sniHost(String sniHost) {
            this.putQueryParameter("SniHost", sniHost);
            this.sniHost = sniHost;
            return this;
        }

        /**
         * <p>SniStatus.</p>
         */
        public Builder sniStatus(Integer sniStatus) {
            this.putQueryParameter("SniStatus", sniStatus);
            this.sniStatus = sniStatus;
            return this;
        }

        /**
         * <p>SourceIps.</p>
         */
        public Builder sourceIps(String sourceIps) {
            this.putQueryParameter("SourceIps", sourceIps);
            this.sourceIps = sourceIps;
            return this;
        }

        /**
         * <p>WriteTime.</p>
         */
        public Builder writeTime(Integer writeTime) {
            this.putQueryParameter("WriteTime", writeTime);
            this.writeTime = writeTime;
            return this;
        }

        public ModifyDomainRequest build() {
            return new ModifyDomainRequest(this);
        } 

    } 

}
