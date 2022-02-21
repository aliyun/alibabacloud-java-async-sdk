// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDnsHostResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDnsHostResponseBody</p>
 */
public class QueryDnsHostResponseBody extends TeaModel {
    @NameInMap("DnsHostList")
    private java.util.List < DnsHostList> dnsHostList;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDnsHostResponseBody(Builder builder) {
        this.dnsHostList = builder.dnsHostList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDnsHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return dnsHostList
     */
    public java.util.List < DnsHostList> getDnsHostList() {
        return this.dnsHostList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DnsHostList> dnsHostList; 
        private String requestId; 

        /**
         * DnsHostList.
         */
        public Builder dnsHostList(java.util.List < DnsHostList> dnsHostList) {
            this.dnsHostList = dnsHostList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDnsHostResponseBody build() {
            return new QueryDnsHostResponseBody(this);
        } 

    } 

    public static class DnsHostList extends TeaModel {
        @NameInMap("DnsName")
        private String dnsName;

        @NameInMap("IpList")
        private java.util.List < String > ipList;

        private DnsHostList(Builder builder) {
            this.dnsName = builder.dnsName;
            this.ipList = builder.ipList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsHostList create() {
            return builder().build();
        }

        /**
         * @return dnsName
         */
        public String getDnsName() {
            return this.dnsName;
        }

        /**
         * @return ipList
         */
        public java.util.List < String > getIpList() {
            return this.ipList;
        }

        public static final class Builder {
            private String dnsName; 
            private java.util.List < String > ipList; 

            /**
             * DnsName.
             */
            public Builder dnsName(String dnsName) {
                this.dnsName = dnsName;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(java.util.List < String > ipList) {
                this.ipList = ipList;
                return this;
            }

            public DnsHostList build() {
                return new DnsHostList(this);
            } 

        } 

    }
}
