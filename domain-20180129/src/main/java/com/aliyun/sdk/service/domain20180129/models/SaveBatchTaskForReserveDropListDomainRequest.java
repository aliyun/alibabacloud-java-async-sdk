// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForReserveDropListDomainRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForReserveDropListDomainRequest</p>
 */
public class SaveBatchTaskForReserveDropListDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Domains> domains;

    private SaveBatchTaskForReserveDropListDomainRequest(Builder builder) {
        super(builder);
        this.contactTemplateId = builder.contactTemplateId;
        this.domains = builder.domains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForReserveDropListDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplateId
     */
    public String getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
        return this.domains;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForReserveDropListDomainRequest, Builder> {
        private String contactTemplateId; 
        private java.util.List < Domains> domains; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForReserveDropListDomainRequest request) {
            super(request);
            this.contactTemplateId = request.contactTemplateId;
            this.domains = request.domains;
        } 

        /**
         * ContactTemplateId.
         */
        public Builder contactTemplateId(String contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * Domains.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        @Override
        public SaveBatchTaskForReserveDropListDomainRequest build() {
            return new SaveBatchTaskForReserveDropListDomainRequest(this);
        } 

    } 

    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dns1")
        private String dns1;

        @com.aliyun.core.annotation.NameInMap("Dns2")
        private String dns2;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domainName;

        private Domains(Builder builder) {
            this.dns1 = builder.dns1;
            this.dns2 = builder.dns2;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return dns1
         */
        public String getDns1() {
            return this.dns1;
        }

        /**
         * @return dns2
         */
        public String getDns2() {
            return this.dns2;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String dns1; 
            private String dns2; 
            private String domainName; 

            /**
             * Dns1.
             */
            public Builder dns1(String dns1) {
                this.dns1 = dns1;
                return this;
            }

            /**
             * Dns2.
             */
            public Builder dns2(String dns2) {
                this.dns2 = dns2;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
