// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLDAPConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLDAPConfigResponseBody</p>
 */
public class DescribeLDAPConfigResponseBody extends TeaModel {
    @NameInMap("Ldap")
    private Ldap ldap;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLDAPConfigResponseBody(Builder builder) {
        this.ldap = builder.ldap;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLDAPConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return ldap
     */
    public Ldap getLdap() {
        return this.ldap;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Ldap ldap; 
        private String requestId; 

        /**
         * Ldap.
         */
        public Builder ldap(Ldap ldap) {
            this.ldap = ldap;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLDAPConfigResponseBody build() {
            return new DescribeLDAPConfigResponseBody(this);
        } 

    } 

    public static class Ldap extends TeaModel {
        @NameInMap("BindDN")
        private String bindDN;

        @NameInMap("SearchBase")
        private String searchBase;

        @NameInMap("URI")
        private String URI;

        private Ldap(Builder builder) {
            this.bindDN = builder.bindDN;
            this.searchBase = builder.searchBase;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ldap create() {
            return builder().build();
        }

        /**
         * @return bindDN
         */
        public String getBindDN() {
            return this.bindDN;
        }

        /**
         * @return searchBase
         */
        public String getSearchBase() {
            return this.searchBase;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String bindDN; 
            private String searchBase; 
            private String URI; 

            /**
             * BindDN.
             */
            public Builder bindDN(String bindDN) {
                this.bindDN = bindDN;
                return this;
            }

            /**
             * SearchBase.
             */
            public Builder searchBase(String searchBase) {
                this.searchBase = searchBase;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Ldap build() {
                return new Ldap(this);
            } 

        } 

    }
}
