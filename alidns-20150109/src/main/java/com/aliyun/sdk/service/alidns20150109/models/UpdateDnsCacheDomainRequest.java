// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDnsCacheDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateDnsCacheDomainRequest</p>
 */
public class UpdateDnsCacheDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheTtlMax")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 30)
    private Integer cacheTtlMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheTtlMin")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 30)
    private Integer cacheTtlMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDnsServer")
    private java.util.List < SourceDnsServer> sourceDnsServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEdns")
    private String sourceEdns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceProtocol")
    private String sourceProtocol;

    private UpdateDnsCacheDomainRequest(Builder builder) {
        super(builder);
        this.cacheTtlMax = builder.cacheTtlMax;
        this.cacheTtlMin = builder.cacheTtlMin;
        this.domainName = builder.domainName;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.sourceDnsServer = builder.sourceDnsServer;
        this.sourceEdns = builder.sourceEdns;
        this.sourceProtocol = builder.sourceProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsCacheDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheTtlMax
     */
    public Integer getCacheTtlMax() {
        return this.cacheTtlMax;
    }

    /**
     * @return cacheTtlMin
     */
    public Integer getCacheTtlMin() {
        return this.cacheTtlMin;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceDnsServer
     */
    public java.util.List < SourceDnsServer> getSourceDnsServer() {
        return this.sourceDnsServer;
    }

    /**
     * @return sourceEdns
     */
    public String getSourceEdns() {
        return this.sourceEdns;
    }

    /**
     * @return sourceProtocol
     */
    public String getSourceProtocol() {
        return this.sourceProtocol;
    }

    public static final class Builder extends Request.Builder<UpdateDnsCacheDomainRequest, Builder> {
        private Integer cacheTtlMax; 
        private Integer cacheTtlMin; 
        private String domainName; 
        private String instanceId; 
        private String lang; 
        private java.util.List < SourceDnsServer> sourceDnsServer; 
        private String sourceEdns; 
        private String sourceProtocol; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDnsCacheDomainRequest request) {
            super(request);
            this.cacheTtlMax = request.cacheTtlMax;
            this.cacheTtlMin = request.cacheTtlMin;
            this.domainName = request.domainName;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.sourceDnsServer = request.sourceDnsServer;
            this.sourceEdns = request.sourceEdns;
            this.sourceProtocol = request.sourceProtocol;
        } 

        /**
         * The maximum TTL period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.
         */
        public Builder cacheTtlMax(Integer cacheTtlMax) {
            this.putQueryParameter("CacheTtlMax", cacheTtlMax);
            this.cacheTtlMax = cacheTtlMax;
            return this;
        }

        /**
         * The minimum time-to-live (TTL) period of the cached data retrieved from the origin Domain Name System (DNS) server. Unit: seconds. Valid values: 30 to 86400.
         */
        public Builder cacheTtlMin(Integer cacheTtlMin) {
            this.putQueryParameter("CacheTtlMin", cacheTtlMin);
            this.cacheTtlMin = cacheTtlMin;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The instance ID of the cache-accelerated domain name.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The origin DNS servers. A maximum of 10 origin DNS servers are supported.
         */
        public Builder sourceDnsServer(java.util.List < SourceDnsServer> sourceDnsServer) {
            this.putQueryParameter("SourceDnsServer", sourceDnsServer);
            this.sourceDnsServer = sourceDnsServer;
            return this;
        }

        /**
         * Specifies whether the origin DNS server supports Extension Mechanisms for DNS (EDNS). Valid values: NOT_SUPPORT and SUPPORT.
         */
        public Builder sourceEdns(String sourceEdns) {
            this.putQueryParameter("SourceEdns", sourceEdns);
            this.sourceEdns = sourceEdns;
            return this;
        }

        /**
         * The origin protocol policy. Valid values: TCP and UDP. Default value: UDP.
         */
        public Builder sourceProtocol(String sourceProtocol) {
            this.putQueryParameter("SourceProtocol", sourceProtocol);
            this.sourceProtocol = sourceProtocol;
            return this;
        }

        @Override
        public UpdateDnsCacheDomainRequest build() {
            return new UpdateDnsCacheDomainRequest(this);
        } 

    } 

    public static class SourceDnsServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private SourceDnsServer(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDnsServer create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private String port; 

            /**
             * The domain name or IP address of the origin DNS server.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The port of the origin DNS server.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public SourceDnsServer build() {
                return new SourceDnsServer(this);
            } 

        } 

    }
}
