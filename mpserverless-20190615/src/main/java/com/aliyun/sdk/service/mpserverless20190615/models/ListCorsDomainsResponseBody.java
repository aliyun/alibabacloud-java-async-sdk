// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorsDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCorsDomainsResponseBody</p>
 */
public class ListCorsDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("RequestId")
    private String requestId;

    private ListCorsDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCorsDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Domains> domains; 
        private String requestId; 

        /**
         * Domains.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCorsDomainsResponseBody build() {
            return new ListCorsDomainsResponseBody(this);
        } 

    } 

    public static class Domains extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("DomainId")
        private String domainId;

        private Domains(Builder builder) {
            this.domain = builder.domain;
            this.domainId = builder.domainId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        public static final class Builder {
            private String domain; 
            private String domainId; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
