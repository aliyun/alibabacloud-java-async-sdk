// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
    private java.util.List<Domains> domains;

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
    public java.util.List<Domains> getDomains() {
        return this.domains;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForReserveDropListDomainRequest, Builder> {
        private String contactTemplateId; 
        private java.util.List<Domains> domains; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForReserveDropListDomainRequest request) {
            super(request);
            this.contactTemplateId = request.contactTemplateId;
            this.domains = request.domains;
        } 

        /**
         * <p>The contact template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        public Builder contactTemplateId(String contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * <p>The domain list.</p>
         * <p>This parameter is required.</p>
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        @Override
        public SaveBatchTaskForReserveDropListDomainRequest build() {
            return new SaveBatchTaskForReserveDropListDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveBatchTaskForReserveDropListDomainRequest} extends {@link TeaModel}
     *
     * <p>SaveBatchTaskForReserveDropListDomainRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Domains model) {
                this.dns1 = model.dns1;
                this.dns2 = model.dns2;
                this.domainName = model.domainName;
            } 

            /**
             * <p>The first custom DNS server.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only if you set <strong>AliyunDns</strong> to <strong>false</strong>.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>Make sure that your custom DNS servers are valid. Otherwise, the domain reservation may fail.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ns11.big<a href="http://www.com">www.com</a></p>
             */
            public Builder dns1(String dns1) {
                this.dns1 = dns1;
                return this;
            }

            /**
             * <p>The second custom DNS server.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only if you set <strong>AliyunDns</strong> to <strong>false</strong>.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>Make sure that your custom DNS servers are valid. Otherwise, the domain reservation may fail.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nsb.263idc.net</p>
             */
            public Builder dns2(String dns2) {
                this.dns2 = dns2;
                return this;
            }

            /**
             * <p>The domain name to reserve.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
