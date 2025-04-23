// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
    private java.util.List<SourceDnsServer> sourceDnsServer;

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
    public java.util.List<SourceDnsServer> getSourceDnsServer() {
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
        private java.util.List<SourceDnsServer> sourceDnsServer; 
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
         * <p>The maximum TTL period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder cacheTtlMax(Integer cacheTtlMax) {
            this.putQueryParameter("CacheTtlMax", cacheTtlMax);
            this.cacheTtlMax = cacheTtlMax;
            return this;
        }

        /**
         * <p>The minimum time-to-live (TTL) period of the cached data retrieved from the origin Domain Name System (DNS) server. Unit: seconds. Valid values: 30 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder cacheTtlMin(Integer cacheTtlMin) {
            this.putQueryParameter("CacheTtlMin", cacheTtlMin);
            this.cacheTtlMin = cacheTtlMin;
            return this;
        }

        /**
         * <p>The domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtian the domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dns.example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The instance ID of the cache-accelerated domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-listcloudgtminstances?spm=a2c63.p38356.help-menu-search-29697.d_0">ListCloudGtmInstances</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dns-sg-l9u2ux1fw01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English Default: <strong>zh</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The origin DNS servers. A maximum of 10 origin DNS servers are supported.</p>
         */
        public Builder sourceDnsServer(java.util.List<SourceDnsServer> sourceDnsServer) {
            this.putQueryParameter("SourceDnsServer", sourceDnsServer);
            this.sourceDnsServer = sourceDnsServer;
            return this;
        }

        /**
         * <p>Specifies whether the origin DNS server supports Extension Mechanisms for DNS (EDNS). Valid values: NOT_SUPPORT and SUPPORT.</p>
         * 
         * <strong>example:</strong>
         * <p>SUPPORT</p>
         */
        public Builder sourceEdns(String sourceEdns) {
            this.putQueryParameter("SourceEdns", sourceEdns);
            this.sourceEdns = sourceEdns;
            return this;
        }

        /**
         * <p>The origin protocol policy. Valid values: TCP and UDP. Default value: UDP.</p>
         * 
         * <strong>example:</strong>
         * <p>UDP</p>
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

    /**
     * 
     * {@link UpdateDnsCacheDomainRequest} extends {@link TeaModel}
     *
     * <p>UpdateDnsCacheDomainRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(SourceDnsServer model) {
                this.host = model.host;
                this.port = model.port;
            } 

            /**
             * <p>The domain name or IP address of the origin DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>223.5.5.5</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port of the origin DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>53</p>
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
