// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForReserveDropListDomainRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForReserveDropListDomainRequest</p>
 */
public class SaveBatchTaskForReserveDropListDomainRequest extends Request {
    @Query
    @NameInMap("ContactTemplateId")
    @Validation(required = true)
    private String contactTemplateId;

    @Query
    @NameInMap("Domains")
    @Validation(required = true)
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
        @NameInMap("DomainName")
        @Validation(required = true)
        private String domainName;

        private Domains(Builder builder) {
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String domainName; 

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
