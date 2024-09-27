// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainNsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainNsResponseBody</p>
 */
public class DescribeDomainNsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllAliDns")
    private Boolean allAliDns;

    @com.aliyun.core.annotation.NameInMap("DetectFailedReasonCode")
    private String detectFailedReasonCode;

    @com.aliyun.core.annotation.NameInMap("DnsServers")
    private DnsServers dnsServers;

    @com.aliyun.core.annotation.NameInMap("ExpectDnsServers")
    private ExpectDnsServers expectDnsServers;

    @com.aliyun.core.annotation.NameInMap("IncludeAliDns")
    private Boolean includeAliDns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether all the name servers are Alibaba Cloud DNS servers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allAliDns(Boolean allAliDns) {
            this.allAliDns = allAliDns;
            return this;
        }

        /**
         * <p>The cause code of the detection failure.</p>
         * 
         * <strong>example:</strong>
         * <p>DnsCheck.Failed</p>
         */
        public Builder detectFailedReasonCode(String detectFailedReasonCode) {
            this.detectFailedReasonCode = detectFailedReasonCode;
            return this;
        }

        /**
         * <p>The DNS server names configured for the domain name.</p>
         */
        public Builder dnsServers(DnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * <p>The Domain Name System (DNS) server names assigned by Alibaba Cloud DNS.</p>
         */
        public Builder expectDnsServers(ExpectDnsServers expectDnsServers) {
            this.expectDnsServers = expectDnsServers;
            return this;
        }

        /**
         * <p>Indicates whether the name servers include Alibaba Cloud DNS servers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeAliDns(Boolean includeAliDns) {
            this.includeAliDns = includeAliDns;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16C7DC7A-2FA7-4D14-8B12-88A2BB6373DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainNsResponseBody build() {
            return new DescribeDomainNsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainNsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainNsResponseBody</p>
     */
    public static class DnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
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
    /**
     * 
     * {@link DescribeDomainNsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainNsResponseBody</p>
     */
    public static class ExpectDnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpectDnsServer")
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
