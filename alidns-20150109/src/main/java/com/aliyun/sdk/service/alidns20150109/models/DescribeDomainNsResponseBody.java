// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainNsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainNsResponseBody</p>
 */
public class DescribeDomainNsResponseBody extends TeaModel {
    @NameInMap("AllAliDns")
    private Boolean allAliDns;

    @NameInMap("DetectFailedReasonCode")
    private String detectFailedReasonCode;

    @NameInMap("DnsServers")
    private DnsServers dnsServers;

    @NameInMap("ExpectDnsServers")
    private ExpectDnsServers expectDnsServers;

    @NameInMap("IncludeAliDns")
    private Boolean includeAliDns;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainNsResponseBody(Builder builder) {
        this.allAliDns = builder.allAliDns;
        this.detectFailedReasonCode = builder.detectFailedReasonCode;
        this.dnsServers = builder.dnsServers;
        this.expectDnsServers = builder.expectDnsServers;
        this.includeAliDns = builder.includeAliDns;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainNsResponseBody create() {
        return builder().build();
    }

    /**
     * @return allAliDns
     */
    public Boolean getAllAliDns() {
        return this.allAliDns;
    }

    /**
     * @return detectFailedReasonCode
     */
    public String getDetectFailedReasonCode() {
        return this.detectFailedReasonCode;
    }

    /**
     * @return dnsServers
     */
    public DnsServers getDnsServers() {
        return this.dnsServers;
    }

    /**
     * @return expectDnsServers
     */
    public ExpectDnsServers getExpectDnsServers() {
        return this.expectDnsServers;
    }

    /**
     * @return includeAliDns
     */
    public Boolean getIncludeAliDns() {
        return this.includeAliDns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean allAliDns; 
        private String detectFailedReasonCode; 
        private DnsServers dnsServers; 
        private ExpectDnsServers expectDnsServers; 
        private Boolean includeAliDns; 
        private String requestId; 

        /**
         * Indicates whether all the name servers were Alibaba Cloud DNS servers.
         */
        public Builder allAliDns(Boolean allAliDns) {
            this.allAliDns = allAliDns;
            return this;
        }

        /**
         * DetectFailedReasonCode.
         */
        public Builder detectFailedReasonCode(String detectFailedReasonCode) {
            this.detectFailedReasonCode = detectFailedReasonCode;
            return this;
        }

        /**
         * The list of DNS servers for the domain name.
         */
        public Builder dnsServers(DnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * The list of DNS servers assigned by Alibaba Cloud.
         */
        public Builder expectDnsServers(ExpectDnsServers expectDnsServers) {
            this.expectDnsServers = expectDnsServers;
            return this;
        }

        /**
         * Indicates whether the name servers included Alibaba Cloud DNS servers.
         */
        public Builder includeAliDns(Boolean includeAliDns) {
            this.includeAliDns = includeAliDns;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainNsResponseBody build() {
            return new DescribeDomainNsResponseBody(this);
        } 

    } 

    public static class DnsServers extends TeaModel {
        @NameInMap("DnsServer")
        private java.util.List < String > dnsServer;

        private DnsServers(Builder builder) {
            this.dnsServer = builder.dnsServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsServers create() {
            return builder().build();
        }

        /**
         * @return dnsServer
         */
        public java.util.List < String > getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List < String > dnsServer; 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List < String > dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public DnsServers build() {
                return new DnsServers(this);
            } 

        } 

    }
    public static class ExpectDnsServers extends TeaModel {
        @NameInMap("ExpectDnsServer")
        private java.util.List < String > expectDnsServer;

        private ExpectDnsServers(Builder builder) {
            this.expectDnsServer = builder.expectDnsServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpectDnsServers create() {
            return builder().build();
        }

        /**
         * @return expectDnsServer
         */
        public java.util.List < String > getExpectDnsServer() {
            return this.expectDnsServer;
        }

        public static final class Builder {
            private java.util.List < String > expectDnsServer; 

            /**
             * ExpectDnsServer.
             */
            public Builder expectDnsServer(java.util.List < String > expectDnsServer) {
                this.expectDnsServer = expectDnsServer;
                return this;
            }

            public ExpectDnsServers build() {
                return new ExpectDnsServers(this);
            } 

        } 

    }
}
