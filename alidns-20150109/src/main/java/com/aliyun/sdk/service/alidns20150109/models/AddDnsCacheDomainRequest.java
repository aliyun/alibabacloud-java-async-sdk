// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsCacheDomainRequest} extends {@link RequestModel}
 *
 * <p>AddDnsCacheDomainRequest</p>
 */
public class AddDnsCacheDomainRequest extends Request {
    @Query
    @NameInMap("CacheTtlMax")
    @Validation(required = true, maximum = 86400, minimum = 30)
    private Integer cacheTtlMax;

    @Query
    @NameInMap("CacheTtlMin")
    @Validation(required = true, maximum = 86400, minimum = 30)
    private Integer cacheTtlMin;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SourceDnsServer")
    @Validation(required = true)
    private java.util.List < SourceDnsServer> sourceDnsServer;

    @Query
    @NameInMap("SourceEdns")
    @Validation(required = true)
    private String sourceEdns;

    @Query
    @NameInMap("SourceProtocol")
    @Validation(required = true)
    private String sourceProtocol;

    private AddDnsCacheDomainRequest(Builder builder) {
        super(builder);
        this.cacheTtlMax = builder.cacheTtlMax;
        this.cacheTtlMin = builder.cacheTtlMin;
        this.domainName = builder.domainName;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.remark = builder.remark;
        this.sourceDnsServer = builder.sourceDnsServer;
        this.sourceEdns = builder.sourceEdns;
        this.sourceProtocol = builder.sourceProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsCacheDomainRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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

    public static final class Builder extends Request.Builder<AddDnsCacheDomainRequest, Builder> {
        private Integer cacheTtlMax; 
        private Integer cacheTtlMin; 
        private String domainName; 
        private String instanceId; 
        private String lang; 
        private String remark; 
        private java.util.List < SourceDnsServer> sourceDnsServer; 
        private String sourceEdns; 
        private String sourceProtocol; 

        private Builder() {
            super();
        } 

        private Builder(AddDnsCacheDomainRequest response) {
            super(response);
            this.cacheTtlMax = response.cacheTtlMax;
            this.cacheTtlMin = response.cacheTtlMin;
            this.domainName = response.domainName;
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.remark = response.remark;
            this.sourceDnsServer = response.sourceDnsServer;
            this.sourceEdns = response.sourceEdns;
            this.sourceProtocol = response.sourceProtocol;
        } 

        /**
         * CacheTtlMax.
         */
        public Builder cacheTtlMax(Integer cacheTtlMax) {
            this.putQueryParameter("CacheTtlMax", cacheTtlMax);
            this.cacheTtlMax = cacheTtlMax;
            return this;
        }

        /**
         * CacheTtlMin.
         */
        public Builder cacheTtlMin(Integer cacheTtlMin) {
            this.putQueryParameter("CacheTtlMin", cacheTtlMin);
            this.cacheTtlMin = cacheTtlMin;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SourceDnsServer.
         */
        public Builder sourceDnsServer(java.util.List < SourceDnsServer> sourceDnsServer) {
            this.putQueryParameter("SourceDnsServer", sourceDnsServer);
            this.sourceDnsServer = sourceDnsServer;
            return this;
        }

        /**
         * SourceEdns.
         */
        public Builder sourceEdns(String sourceEdns) {
            this.putQueryParameter("SourceEdns", sourceEdns);
            this.sourceEdns = sourceEdns;
            return this;
        }

        /**
         * SourceProtocol.
         */
        public Builder sourceProtocol(String sourceProtocol) {
            this.putQueryParameter("SourceProtocol", sourceProtocol);
            this.sourceProtocol = sourceProtocol;
            return this;
        }

        @Override
        public AddDnsCacheDomainRequest build() {
            return new AddDnsCacheDomainRequest(this);
        } 

    } 

    public static class SourceDnsServer extends TeaModel {
        @NameInMap("Host")
        @Validation(required = true)
        private String host;

        @NameInMap("Port")
        @Validation(required = true)
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
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
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
