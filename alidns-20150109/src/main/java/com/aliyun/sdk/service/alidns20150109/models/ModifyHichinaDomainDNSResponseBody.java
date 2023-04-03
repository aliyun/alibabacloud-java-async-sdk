// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHichinaDomainDNSResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHichinaDomainDNSResponseBody</p>
 */
public class ModifyHichinaDomainDNSResponseBody extends TeaModel {
    @NameInMap("NewDnsServers")
    private NewDnsServers newDnsServers;

    @NameInMap("OriginalDnsServers")
    private OriginalDnsServers originalDnsServers;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyHichinaDomainDNSResponseBody(Builder builder) {
        this.newDnsServers = builder.newDnsServers;
        this.originalDnsServers = builder.originalDnsServers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHichinaDomainDNSResponseBody create() {
        return builder().build();
    }

    /**
     * @return newDnsServers
     */
    public NewDnsServers getNewDnsServers() {
        return this.newDnsServers;
    }

    /**
     * @return originalDnsServers
     */
    public OriginalDnsServers getOriginalDnsServers() {
        return this.originalDnsServers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NewDnsServers newDnsServers; 
        private OriginalDnsServers originalDnsServers; 
        private String requestId; 

        /**
         * The list of DNS servers after the domain name is changed.
         */
        public Builder newDnsServers(NewDnsServers newDnsServers) {
            this.newDnsServers = newDnsServers;
            return this;
        }

        /**
         * The list of DNS servers before the domain name is changed.
         */
        public Builder originalDnsServers(OriginalDnsServers originalDnsServers) {
            this.originalDnsServers = originalDnsServers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyHichinaDomainDNSResponseBody build() {
            return new ModifyHichinaDomainDNSResponseBody(this);
        } 

    } 

    public static class NewDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        private java.util.List < String > dnsServer;

        private NewDnsServers(Builder builder) {
            this.dnsServer = builder.dnsServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewDnsServers create() {
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

            public NewDnsServers build() {
                return new NewDnsServers(this);
            } 

        } 

    }
    public static class OriginalDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        private java.util.List < String > dnsServer;

        private OriginalDnsServers(Builder builder) {
            this.dnsServer = builder.dnsServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalDnsServers create() {
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

            public OriginalDnsServers build() {
                return new OriginalDnsServers(this);
            } 

        } 

    }
}
