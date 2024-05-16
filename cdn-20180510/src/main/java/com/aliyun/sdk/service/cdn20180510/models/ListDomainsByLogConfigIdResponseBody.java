// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDomainsByLogConfigIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsByLogConfigIdResponseBody</p>
 */
public class ListDomainsByLogConfigIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private Domains domains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDomainsByLogConfigIdResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsByLogConfigIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public Domains getDomains() {
        return this.domains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Domains domains; 
        private String requestId; 

        /**
         * The domain names.
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDomainsByLogConfigIdResponseBody build() {
            return new ListDomainsByLogConfigIdResponseBody(this);
        } 

    } 

    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private java.util.List < String > domain;

        private Domains(Builder builder) {
            this.domain = builder.domain;
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
        public java.util.List < String > getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List < String > domain; 

            /**
             * Domain.
             */
            public Builder domain(java.util.List < String > domain) {
                this.domain = domain;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
