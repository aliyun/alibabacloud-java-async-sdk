// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetDomainInfoForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainInfoForPartnerResponseBody</p>
 */
public class GetDomainInfoForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDomainInfoForPartnerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainInfoForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDomainInfoForPartnerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDomainInfoForPartnerResponseBody build() {
            return new GetDomainInfoForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDomainInfoForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetDomainInfoForPartnerResponseBody</p>
     */
    public static class Ownership extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        private Ownership(Builder builder) {
            this.account = builder.account;
            this.provider = builder.provider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ownership create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        public static final class Builder {
            private String account; 
            private String provider; 

            private Builder() {
            } 

            private Builder(Ownership model) {
                this.account = model.account;
                this.provider = model.provider;
            } 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            public Ownership build() {
                return new Ownership(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDomainInfoForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetDomainInfoForPartnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("NameServers")
        private String nameServers;

        @com.aliyun.core.annotation.NameInMap("Ownership")
        private Ownership ownership;

        @com.aliyun.core.annotation.NameInMap("Registrar")
        private String registrar;

        private Data(Builder builder) {
            this.domainName = builder.domainName;
            this.nameServers = builder.nameServers;
            this.ownership = builder.ownership;
            this.registrar = builder.registrar;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return nameServers
         */
        public String getNameServers() {
            return this.nameServers;
        }

        /**
         * @return ownership
         */
        public Ownership getOwnership() {
            return this.ownership;
        }

        /**
         * @return registrar
         */
        public String getRegistrar() {
            return this.registrar;
        }

        public static final class Builder {
            private String domainName; 
            private String nameServers; 
            private Ownership ownership; 
            private String registrar; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.domainName = model.domainName;
                this.nameServers = model.nameServers;
                this.ownership = model.ownership;
                this.registrar = model.registrar;
            } 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * NameServers.
             */
            public Builder nameServers(String nameServers) {
                this.nameServers = nameServers;
                return this;
            }

            /**
             * Ownership.
             */
            public Builder ownership(Ownership ownership) {
                this.ownership = ownership;
                return this;
            }

            /**
             * Registrar.
             */
            public Builder registrar(String registrar) {
                this.registrar = registrar;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
