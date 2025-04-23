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
 * {@link AddDomainResponseBody} extends {@link TeaModel}
 *
 * <p>AddDomainResponseBody</p>
 */
public class AddDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnsServers")
    private DnsServers dnsServers;

    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("PunyCode")
    private String punyCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDomainResponseBody(Builder builder) {
        this.dnsServers = builder.dnsServers;
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.punyCode = builder.punyCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsServers
     */
    public DnsServers getDnsServers() {
        return this.dnsServers;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return punyCode
     */
    public String getPunyCode() {
        return this.punyCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DnsServers dnsServers; 
        private String domainId; 
        private String domainName; 
        private String groupId; 
        private String groupName; 
        private String punyCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddDomainResponseBody model) {
            this.dnsServers = model.dnsServers;
            this.domainId = model.domainId;
            this.domainName = model.domainName;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.punyCode = model.punyCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Domain Name System (DNS) servers configured for the domain name.</p>
         */
        public Builder dnsServers(DnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>00efd71a-770e-4255-b54e-6fe5659baffe</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>dns-example.top</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyGroup</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The Punycode for the domain name. This parameter is returned only for Chinese domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>xn--fsq270a.com</p>
         */
        public Builder punyCode(String punyCode) {
            this.punyCode = punyCode;
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

        public AddDomainResponseBody build() {
            return new AddDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddDomainResponseBody} extends {@link TeaModel}
     *
     * <p>AddDomainResponseBody</p>
     */
    public static class DnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private java.util.List<String> dnsServer;

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
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List<String> dnsServer; 

            private Builder() {
            } 

            private Builder(DnsServers model) {
                this.dnsServer = model.dnsServer;
            } 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List<String> dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public DnsServers build() {
                return new DnsServers(this);
            } 

        } 

    }
}
