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
 * {@link ModifyHichinaDomainDNSResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHichinaDomainDNSResponseBody</p>
 */
public class ModifyHichinaDomainDNSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewDnsServers")
    private NewDnsServers newDnsServers;

    @com.aliyun.core.annotation.NameInMap("OriginalDnsServers")
    private OriginalDnsServers originalDnsServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The DNS server names after modification.</p>
         */
        public Builder newDnsServers(NewDnsServers newDnsServers) {
            this.newDnsServers = newDnsServers;
            return this;
        }

        /**
         * <p>The DNS server names before modification.</p>
         */
        public Builder originalDnsServers(OriginalDnsServers originalDnsServers) {
            this.originalDnsServers = originalDnsServers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyHichinaDomainDNSResponseBody build() {
            return new ModifyHichinaDomainDNSResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyHichinaDomainDNSResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyHichinaDomainDNSResponseBody</p>
     */
    public static class NewDnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private java.util.List<String> dnsServer;

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
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List<String> dnsServer; 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List<String> dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public NewDnsServers build() {
                return new NewDnsServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyHichinaDomainDNSResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyHichinaDomainDNSResponseBody</p>
     */
    public static class OriginalDnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private java.util.List<String> dnsServer;

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
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List<String> dnsServer; 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List<String> dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public OriginalDnsServers build() {
                return new OriginalDnsServers(this);
            } 

        } 

    }
}
