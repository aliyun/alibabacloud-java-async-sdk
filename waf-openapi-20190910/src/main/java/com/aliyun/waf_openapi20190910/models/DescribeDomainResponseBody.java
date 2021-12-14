// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResponseBody</p>
 */
public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("Domain")
    private Domain domain;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeDomainResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Domain domain; 
        private String requestId; 

        /**
         * <p>Domain.</p>
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainResponseBody build() {
            return new DescribeDomainResponseBody(this);
        } 

    } 

    public static class ProtocolPortConfigs extends TeaModel {
        @NameInMap("Ports")
        private String ports;

        @NameInMap("Protocol")
        private String protocol;


        private ProtocolPortConfigs(Builder builder) {
            this.ports = builder.ports;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolPortConfigs create() {
            return builder().build();
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String ports; 
            private String protocol; 

            /**
             * <p>Ports.</p>
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>Protocol.</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public ProtocolPortConfigs build() {
                return new ProtocolPortConfigs(this);
            } 

        } 

    }
    public static class CloudNativeInstances extends TeaModel {
        @NameInMap("CloudNativeProductName")
        private String cloudNativeProductName;

        @NameInMap("IPAddressList")
        private String IPAddressList;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ProtocolPortConfigs")
        private java.util.List < ProtocolPortConfigs> protocolPortConfigs;

        @NameInMap("RedirectionTypeName")
        private String redirectionTypeName;


        private CloudNativeInstances(Builder builder) {
            this.cloudNativeProductName = builder.cloudNativeProductName;
            this.IPAddressList = builder.IPAddressList;
            this.instanceId = builder.instanceId;
            this.protocolPortConfigs = builder.protocolPortConfigs;
            this.redirectionTypeName = builder.redirectionTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudNativeInstances create() {
            return builder().build();
        }

        /**
         * @return cloudNativeProductName
         */
        public String getCloudNativeProductName() {
            return this.cloudNativeProductName;
        }

        /**
         * @return IPAddressList
         */
        public String getIPAddressList() {
            return this.IPAddressList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocolPortConfigs
         */
        public java.util.List < ProtocolPortConfigs> getProtocolPortConfigs() {
            return this.protocolPortConfigs;
        }

        /**
         * @return redirectionTypeName
         */
        public String getRedirectionTypeName() {
            return this.redirectionTypeName;
        }

        public static final class Builder {
            private String cloudNativeProductName; 
            private String IPAddressList; 
            private String instanceId; 
            private java.util.List < ProtocolPortConfigs> protocolPortConfigs; 
            private String redirectionTypeName; 

            /**
             * <p>CloudNativeProductName.</p>
             */
            public Builder cloudNativeProductName(String cloudNativeProductName) {
                this.cloudNativeProductName = cloudNativeProductName;
                return this;
            }

            /**
             * <p>IPAddressList.</p>
             */
            public Builder IPAddressList(String IPAddressList) {
                this.IPAddressList = IPAddressList;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>ProtocolPortConfigs.</p>
             */
            public Builder protocolPortConfigs(java.util.List < ProtocolPortConfigs> protocolPortConfigs) {
                this.protocolPortConfigs = protocolPortConfigs;
                return this;
            }

            /**
             * <p>RedirectionTypeName.</p>
             */
            public Builder redirectionTypeName(String redirectionTypeName) {
                this.redirectionTypeName = redirectionTypeName;
                return this;
            }

            public CloudNativeInstances build() {
                return new CloudNativeInstances(this);
            } 

        } 

    }
    public static class LogHeaders extends TeaModel {
        @NameInMap("k")
        private String k;

        @NameInMap("v")
        private String v;


        private LogHeaders(Builder builder) {
            this.k = builder.k;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogHeaders create() {
            return builder().build();
        }

        /**
         * @return k
         */
        public String getK() {
            return this.k;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private String k; 
            private String v; 

            /**
             * <p>k.</p>
             */
            public Builder k(String k) {
                this.k = k;
                return this;
            }

            /**
             * <p>v.</p>
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public LogHeaders build() {
                return new LogHeaders(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @NameInMap("AccessHeaderMode")
        private Integer accessHeaderMode;

        @NameInMap("AccessHeaders")
        private java.util.List < String > accessHeaders;

        @NameInMap("AccessType")
        private String accessType;

        @NameInMap("CloudNativeInstances")
        private java.util.List < CloudNativeInstances> cloudNativeInstances;

        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("ConnectionTime")
        private Integer connectionTime;

        @NameInMap("Http2Port")
        private java.util.List < String > http2Port;

        @NameInMap("HttpPort")
        private java.util.List < String > httpPort;

        @NameInMap("HttpToUserIp")
        private Integer httpToUserIp;

        @NameInMap("HttpsPort")
        private java.util.List < String > httpsPort;

        @NameInMap("HttpsRedirect")
        private Integer httpsRedirect;

        @NameInMap("IpFollowStatus")
        private Integer ipFollowStatus;

        @NameInMap("IsAccessProduct")
        private Integer isAccessProduct;

        @NameInMap("LoadBalancing")
        private Integer loadBalancing;

        @NameInMap("LogHeaders")
        private java.util.List < LogHeaders> logHeaders;

        @NameInMap("ReadTime")
        private Integer readTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SniHost")
        private String sniHost;

        @NameInMap("SniStatus")
        private Integer sniStatus;

        @NameInMap("SourceIps")
        private java.util.List < String > sourceIps;

        @NameInMap("Version")
        private Long version;

        @NameInMap("WriteTime")
        private Integer writeTime;


        private Domain(Builder builder) {
            this.accessHeaderMode = builder.accessHeaderMode;
            this.accessHeaders = builder.accessHeaders;
            this.accessType = builder.accessType;
            this.cloudNativeInstances = builder.cloudNativeInstances;
            this.clusterType = builder.clusterType;
            this.cname = builder.cname;
            this.connectionTime = builder.connectionTime;
            this.http2Port = builder.http2Port;
            this.httpPort = builder.httpPort;
            this.httpToUserIp = builder.httpToUserIp;
            this.httpsPort = builder.httpsPort;
            this.httpsRedirect = builder.httpsRedirect;
            this.ipFollowStatus = builder.ipFollowStatus;
            this.isAccessProduct = builder.isAccessProduct;
            this.loadBalancing = builder.loadBalancing;
            this.logHeaders = builder.logHeaders;
            this.readTime = builder.readTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.sniHost = builder.sniHost;
            this.sniStatus = builder.sniStatus;
            this.sourceIps = builder.sourceIps;
            this.version = builder.version;
            this.writeTime = builder.writeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
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
        public java.util.List < String > getAccessHeaders() {
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
        public java.util.List < CloudNativeInstances> getCloudNativeInstances() {
            return this.cloudNativeInstances;
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return connectionTime
         */
        public Integer getConnectionTime() {
            return this.connectionTime;
        }

        /**
         * @return http2Port
         */
        public java.util.List < String > getHttp2Port() {
            return this.http2Port;
        }

        /**
         * @return httpPort
         */
        public java.util.List < String > getHttpPort() {
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
        public java.util.List < String > getHttpsPort() {
            return this.httpsPort;
        }

        /**
         * @return httpsRedirect
         */
        public Integer getHttpsRedirect() {
            return this.httpsRedirect;
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
        public java.util.List < LogHeaders> getLogHeaders() {
            return this.logHeaders;
        }

        /**
         * @return readTime
         */
        public Integer getReadTime() {
            return this.readTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        public java.util.List < String > getSourceIps() {
            return this.sourceIps;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return writeTime
         */
        public Integer getWriteTime() {
            return this.writeTime;
        }

        public static final class Builder {
            private Integer accessHeaderMode; 
            private java.util.List < String > accessHeaders; 
            private String accessType; 
            private java.util.List < CloudNativeInstances> cloudNativeInstances; 
            private Integer clusterType; 
            private String cname; 
            private Integer connectionTime; 
            private java.util.List < String > http2Port; 
            private java.util.List < String > httpPort; 
            private Integer httpToUserIp; 
            private java.util.List < String > httpsPort; 
            private Integer httpsRedirect; 
            private Integer ipFollowStatus; 
            private Integer isAccessProduct; 
            private Integer loadBalancing; 
            private java.util.List < LogHeaders> logHeaders; 
            private Integer readTime; 
            private String resourceGroupId; 
            private String sniHost; 
            private Integer sniStatus; 
            private java.util.List < String > sourceIps; 
            private Long version; 
            private Integer writeTime; 

            /**
             * <p>AccessHeaderMode.</p>
             */
            public Builder accessHeaderMode(Integer accessHeaderMode) {
                this.accessHeaderMode = accessHeaderMode;
                return this;
            }

            /**
             * <p>AccessHeaders.</p>
             */
            public Builder accessHeaders(java.util.List < String > accessHeaders) {
                this.accessHeaders = accessHeaders;
                return this;
            }

            /**
             * <p>AccessType.</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>CloudNativeInstances.</p>
             */
            public Builder cloudNativeInstances(java.util.List < CloudNativeInstances> cloudNativeInstances) {
                this.cloudNativeInstances = cloudNativeInstances;
                return this;
            }

            /**
             * <p>ClusterType.</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>Cname.</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>ConnectionTime.</p>
             */
            public Builder connectionTime(Integer connectionTime) {
                this.connectionTime = connectionTime;
                return this;
            }

            /**
             * <p>Http2Port.</p>
             */
            public Builder http2Port(java.util.List < String > http2Port) {
                this.http2Port = http2Port;
                return this;
            }

            /**
             * <p>HttpPort.</p>
             */
            public Builder httpPort(java.util.List < String > httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * <p>HttpToUserIp.</p>
             */
            public Builder httpToUserIp(Integer httpToUserIp) {
                this.httpToUserIp = httpToUserIp;
                return this;
            }

            /**
             * <p>HttpsPort.</p>
             */
            public Builder httpsPort(java.util.List < String > httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * <p>HttpsRedirect.</p>
             */
            public Builder httpsRedirect(Integer httpsRedirect) {
                this.httpsRedirect = httpsRedirect;
                return this;
            }

            /**
             * <p>IpFollowStatus.</p>
             */
            public Builder ipFollowStatus(Integer ipFollowStatus) {
                this.ipFollowStatus = ipFollowStatus;
                return this;
            }

            /**
             * <p>IsAccessProduct.</p>
             */
            public Builder isAccessProduct(Integer isAccessProduct) {
                this.isAccessProduct = isAccessProduct;
                return this;
            }

            /**
             * <p>LoadBalancing.</p>
             */
            public Builder loadBalancing(Integer loadBalancing) {
                this.loadBalancing = loadBalancing;
                return this;
            }

            /**
             * <p>LogHeaders.</p>
             */
            public Builder logHeaders(java.util.List < LogHeaders> logHeaders) {
                this.logHeaders = logHeaders;
                return this;
            }

            /**
             * <p>ReadTime.</p>
             */
            public Builder readTime(Integer readTime) {
                this.readTime = readTime;
                return this;
            }

            /**
             * <p>ResourceGroupId.</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>SniHost.</p>
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * <p>SniStatus.</p>
             */
            public Builder sniStatus(Integer sniStatus) {
                this.sniStatus = sniStatus;
                return this;
            }

            /**
             * <p>SourceIps.</p>
             */
            public Builder sourceIps(java.util.List < String > sourceIps) {
                this.sourceIps = sourceIps;
                return this;
            }

            /**
             * <p>Version.</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>WriteTime.</p>
             */
            public Builder writeTime(Integer writeTime) {
                this.writeTime = writeTime;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
}
