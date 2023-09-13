// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainDnsChallengeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainDnsChallengeResponseBody</p>
 */
public class GetDomainDnsChallengeResponseBody extends TeaModel {
    @NameInMap("DomainDnsChallenge")
    private DomainDnsChallenge domainDnsChallenge;

    @NameInMap("RequestId")
    private String requestId;

    private GetDomainDnsChallengeResponseBody(Builder builder) {
        this.domainDnsChallenge = builder.domainDnsChallenge;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainDnsChallengeResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainDnsChallenge
     */
    public DomainDnsChallenge getDomainDnsChallenge() {
        return this.domainDnsChallenge;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainDnsChallenge domainDnsChallenge; 
        private String requestId; 

        /**
         * DomainDnsChallenge.
         */
        public Builder domainDnsChallenge(DomainDnsChallenge domainDnsChallenge) {
            this.domainDnsChallenge = domainDnsChallenge;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDomainDnsChallengeResponseBody build() {
            return new GetDomainDnsChallengeResponseBody(this);
        } 

    } 

    public static class DomainDnsChallenge extends TeaModel {
        @NameInMap("DnsChallengeName")
        private String dnsChallengeName;

        @NameInMap("DnsChallengeValue")
        private String dnsChallengeValue;

        @NameInMap("DnsType")
        private String dnsType;

        private DomainDnsChallenge(Builder builder) {
            this.dnsChallengeName = builder.dnsChallengeName;
            this.dnsChallengeValue = builder.dnsChallengeValue;
            this.dnsType = builder.dnsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainDnsChallenge create() {
            return builder().build();
        }

        /**
         * @return dnsChallengeName
         */
        public String getDnsChallengeName() {
            return this.dnsChallengeName;
        }

        /**
         * @return dnsChallengeValue
         */
        public String getDnsChallengeValue() {
            return this.dnsChallengeValue;
        }

        /**
         * @return dnsType
         */
        public String getDnsType() {
            return this.dnsType;
        }

        public static final class Builder {
            private String dnsChallengeName; 
            private String dnsChallengeValue; 
            private String dnsType; 

            /**
             * DNS challenge名称。
             */
            public Builder dnsChallengeName(String dnsChallengeName) {
                this.dnsChallengeName = dnsChallengeName;
                return this;
            }

            /**
             * DNS challenge值。
             */
            public Builder dnsChallengeValue(String dnsChallengeValue) {
                this.dnsChallengeValue = dnsChallengeValue;
                return this;
            }

            /**
             * DNS记录类型。
             */
            public Builder dnsType(String dnsType) {
                this.dnsType = dnsType;
                return this;
            }

            public DomainDnsChallenge build() {
                return new DomainDnsChallenge(this);
            } 

        } 

    }
}
