// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDomainDnsChallengeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainDnsChallengeResponseBody</p>
 */
public class GetDomainDnsChallengeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainDnsChallenge")
    private DomainDnsChallenge domainDnsChallenge;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    /**
     * 
     * {@link GetDomainDnsChallengeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDomainDnsChallengeResponseBody</p>
     */
    public static class DomainDnsChallenge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsChallengeName")
        private String dnsChallengeName;

        @com.aliyun.core.annotation.NameInMap("DnsChallengeValue")
        private String dnsChallengeValue;

        @com.aliyun.core.annotation.NameInMap("DnsType")
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
             * <p>DNS challenge名称。</p>
             * 
             * <strong>example:</strong>
             * <p>_idaas-challenge.${domain}</p>
             */
            public Builder dnsChallengeName(String dnsChallengeName) {
                this.dnsChallengeName = dnsChallengeName;
                return this;
            }

            /**
             * <p>DNS challenge值。</p>
             * 
             * <strong>example:</strong>
             * <p>exmple123xxx</p>
             */
            public Builder dnsChallengeValue(String dnsChallengeValue) {
                this.dnsChallengeValue = dnsChallengeValue;
                return this;
            }

            /**
             * <p>DNS记录类型。</p>
             * 
             * <strong>example:</strong>
             * <p>枚举，目前只支持TXT类型</p>
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
