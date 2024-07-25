// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatewayRouteDomainInfo} extends {@link TeaModel}
 *
 * <p>GatewayRouteDomainInfo</p>
 */
public class GatewayRouteDomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("domains")
    private java.util.List < Domains> domains;

    private GatewayRouteDomainInfo(Builder builder) {
        this.domains = builder.domains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatewayRouteDomainInfo create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
        return this.domains;
    }

    public static final class Builder {
        private java.util.List < Domains> domains; 

        /**
         * domains.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        public GatewayRouteDomainInfo build() {
            return new GatewayRouteDomainInfo(this);
        } 

    } 

    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Domains(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String protocol; 

            /**
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
